package controller;

import org.icefaces.ace.component.datatable.DataTable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.Serializable;

@ManagedBean(name = "dataTableSearchBean")
@CustomScoped(value = "#{window}")
public class DataTableSearchBean implements Serializable {

    /*  public static final String BEAN_NAME = "dataTableSearchBean";*/
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

    private boolean caseSensitive;

    public DataTableSearchBean() {
    }

   /* public String getBeanName() {
        return class.getName(); }*/ // если я вызываю из ребенка, мне вернется имя ребенка или имя родителя?

    public Class getClazz() {
        return getClass();
    }

    public void find(javax.faces.event.ActionEvent e, Object bean) {

        DataTable iceTable = ((DataTableBindings) (FacesUtils.getManagedBean(bean.getClass().getName()))).getTable(bean.getClass());

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
