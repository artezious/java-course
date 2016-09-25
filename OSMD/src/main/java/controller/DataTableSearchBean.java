package controller;

import org.icefaces.ace.component.column.Column;
import org.icefaces.ace.component.datatable.DataTable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "dataTableSearchBean")
@CustomScoped(value = "#{window}")
public class DataTableSearchBean implements Serializable {

    /*  public static final String BEAN_NAME = "dataTableSearchBean";*/
    private final SelectItem[] SEARCH_MODES = {new SelectItem("startsWith", "Starts With"),
            new SelectItem("endsWith", "Ends With"),
            new SelectItem("contains", "Contains"),
            new SelectItem("exact", "Exact Match")};
    private final SelectItem[] COLUMNS = {new SelectItem("id", "Id"),
            new SelectItem("name", "Name"),
            new SelectItem("surname", "Surname"),
            new SelectItem("address", "Address"),
            new SelectItem("telephone", "Telephone"),
            new SelectItem("email", "Email")};
    private final SelectItem[] EFFECT_TYPES = {new SelectItem("none", "None"),
            new SelectItem("default", "Default (Highlight)"),
            new SelectItem("pulsate", "Pulsate")};
    private String selectedEffectType = "default";
    private String selectedSearchMode = "contains";
    private String searchQuery = "";
    private String[] selectedColumns = new String[]{"id", "name", "surname", "address", "telephone", "email", "mpg", "cost"};
    private int lastFoundIndex = -1;

    private boolean caseSensitive;

    public DataTableSearchBean() {
    }

   /* public String getBeanName() {
        return class.getName(); }*/ // если я вызываю из ребенка, мне вернется имя ребенка или имя родителя?

    public Class getClazz() {
        return getClass();
    }

    public void find(Object bean) {
//or this.getClass
        DataTable iceTable = ((DataTableBindings) (FacesUtils.getManagedBean("dataTableBindings"))).getTable(bean.getClass());
        List<Column> columns = iceTable.getColumns();
        String[] selectedColumns = new String[columns.size()];
        int index = 0;
        for (Column col : columns) {
            selectedColumns[index++] = col.getId();
        }
//        DataTable.SearchType type = null;
//        if (selectedSearchMode.equals("contains"))
//            type = DataTable.SearchType.CONTAINS;
//        else if (selectedSearchMode.equals("startsWith"))
//            type = DataTable.SearchType.STARTS_WITH;
//        else if (selectedSearchMode.equals("endsWith"))
//            type = DataTable.SearchType.ENDS_WITH;
//        else if (selectedSearchMode.equals("exact"))
//            type = DataTable.SearchType.EXACT;
//        else type = DataTable.SearchType.CONTAINS;

        int newFoundIndex = iceTable.findRow(searchQuery, selectedColumns, lastFoundIndex + 1);

        if (newFoundIndex < 0) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(iceTable.getClientId(context),
                    new FacesMessage("Search starting at index " + (lastFoundIndex + 1) + " for \"" + searchQuery + "\" did not return a result."));
            return;
        }

        lastFoundIndex = newFoundIndex;


        iceTable.navigateToRow(lastFoundIndex, DataTable.SearchEffect.PULSATE);

    }

    public void reset(javax.faces.event.ActionEvent e) {
        lastFoundIndex = -1;
    }

    public SelectItem[] getSEARCH_MODES() {
        return SEARCH_MODES;
    }

    public SelectItem[] getCOLUMNS() {
        return COLUMNS;
    }

    public SelectItem[] getEFFECT_TYPES() {
        return EFFECT_TYPES;
    }

    public String getSelectedEffectType() {
        return selectedEffectType;
    }

    public String getSelectedSearchMode() {
        return selectedSearchMode;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public String[] getSelectedColumns() {
        return selectedColumns;
    }

    public int getLastFoundIndex() {
        return lastFoundIndex;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }
}
