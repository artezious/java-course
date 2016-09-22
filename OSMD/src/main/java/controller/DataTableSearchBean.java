package controller;

import org.icefaces.ace.component.datatable.DataTable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.Serializable;

/**
 * Created by WEO on 9/21/16.
 */

@ManagedBean(name = DataTableSearchBean.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class DataTableSearchBean implements Serializable {

    public static final String BEAN_NAME = "dataTableSearchBean";
    public final SelectItem[] SEARCH_MODES = {new SelectItem("startsWith", "Starts With"),
            new SelectItem("endsWith", "Ends With"),
            new SelectItem("contains", "Contains"),
            new SelectItem("exact", "Exact Match")};
    public final SelectItem[] COLUMNS = {new SelectItem("id", "Id"),
            new SelectItem("name", "Name"),
            new SelectItem("surname", "Surname"),
            new SelectItem("address", "Address"),
            new SelectItem("telephone", "Telephone"),
            new SelectItem("email", "Email")};
    public final SelectItem[] EFFECT_TYPES = {new SelectItem("none", "None"),
            new SelectItem("default", "Default (Highlight)"),
            new SelectItem("pulsate", "Pulsate")};
    public String selectedEffectType = "default";
    public String selectedSearchMode = "contains";
    public String searchQuery = "";
    public String[] selectedColumns = new String[]{"id", "name", "surname", "address", "telephone", "email", "mpg", "cost"};
    public int lastFoundIndex = -1;
    @ManagedProperty(value = "#{userDataTableBean}")
    private UserDataTableBean userDataTableBean;
    @ManagedProperty(value = "#{serviceDataTableBean}")
    private ServiceDataTableBean serviceDataTableBean;
    @ManagedProperty(value = "#{paymentDataTableBean}")
    private PaymentDataTableBean paymentDataTableBean;
    @ManagedProperty(value = "#{consumptionDataTableBean}")
    private ConsumptionDataTableBean consumptionDataTableBean;
    @ManagedProperty(value = "#{statementDataTableBean}")
    private StatementDataTableBean statementDataTableBean;
    private boolean caseSensitive;

    public DataTableSearchBean() {
    }

    public UserDataTableBean getUserDataTableBean() {
        return userDataTableBean;
    }

    public void setUserDataTableBean(UserDataTableBean userDataTableBean) {
        this.userDataTableBean = userDataTableBean;
    }

    public ServiceDataTableBean getServiceDataTableBean() {
        return serviceDataTableBean;
    }

    public void setServiceDataTableBean(ServiceDataTableBean serviceDataTableBean) {
        this.serviceDataTableBean = serviceDataTableBean;
    }

    public PaymentDataTableBean getPaymentDataTableBean() {
        return paymentDataTableBean;
    }

    public void setPaymentDataTableBean(PaymentDataTableBean paymentDataTableBean) {
        this.paymentDataTableBean = paymentDataTableBean;
    }

    public ConsumptionDataTableBean getConsumptionDataTableBean() {
        return consumptionDataTableBean;
    }

    public void setConsumptionDataTableBean(ConsumptionDataTableBean consumptionDataTableBean) {
        this.consumptionDataTableBean = consumptionDataTableBean;
    }

    public StatementDataTableBean getStatementDataTableBean() {
        return statementDataTableBean;
    }

    public void setStatementDataTableBean(StatementDataTableBean statementDataTableBean) {
        this.statementDataTableBean = statementDataTableBean;
    }

    public String getBeanName() {
        return BEAN_NAME;
    }

    public Class getClazz() {
        return getClass();
    }

    public void find(javax.faces.event.ActionEvent e) {

*******************************
        DataTable iceTable = ((DataTableBindings) (FacesUtils.getManagedBean("dataTableBindings"))).getTable(this.getClass());

        DataTable.SearchType type = null;
        if (selectedSearchMode.equals("contains"))
            type = DataTable.SearchType.CONTAINS;
        else if (selectedSearchMode.equals("startsWith"))
            type = DataTable.SearchType.STARTS_WITH;
        else if (selectedSearchMode.equals("endsWith"))
            type = DataTable.SearchType.ENDS_WITH;
        else if (selectedSearchMode.equals("exact"))
            type = DataTable.SearchType.EXACT;
        else type = DataTable.SearchType.CONTAINS;

        int newFoundIndex = iceTable.findRow(searchQuery, selectedColumns, lastFoundIndex + 1, type, caseSensitive);

        if (newFoundIndex < 0) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(iceTable.getClientId(context),
                    new FacesMessage("Search starting at index " + (lastFoundIndex + 1) + " for \"" + searchQuery + "\" did not return a result."));
            return;
        }

        lastFoundIndex = newFoundIndex;

        if (selectedEffectType.equals("default"))
            iceTable.navigateToRow(lastFoundIndex);
        else if (selectedEffectType.equals("pulsate"))
            iceTable.navigateToRow(lastFoundIndex, DataTable.SearchEffect.PULSATE);
        else if (selectedEffectType.equals("none"))
            iceTable.navigateToRow(lastFoundIndex, null);
    }

    public void reset(javax.faces.event.ActionEvent e) {
        lastFoundIndex = -1;
    }


}
