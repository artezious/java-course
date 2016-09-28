package controller;

import org.icefaces.ace.component.column.Column;
import org.icefaces.ace.component.datatable.DataTable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;


@ManagedBean(name = "dataTableSearchBean")
@CustomScoped(value = "#{window}")
public class DataTableSearchBean implements Serializable {

    private String selectedEffectType = "default";
    private String selectedSearchMode = "contains";
    private String searchQuery = "";
    private int lastFoundIndex = -1;

    private boolean caseSensitive;

    public DataTableSearchBean() {
    }


    public String getSelectedEffectType() {
        return selectedEffectType;
    }

    public void setSelectedEffectType(String selectedEffectType) {
        this.selectedEffectType = selectedEffectType;
    }

    public String getSelectedSearchMode() {
        return selectedSearchMode;
    }

    public void setSelectedSearchMode(String selectedSearchMode) {
        this.selectedSearchMode = selectedSearchMode;
    }

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

  /*  public String[] getSelectedColumns() {
        return selectedColumns;
    }

    public void setSelectedColumns(String[] selectedColumns) {
        this.selectedColumns = selectedColumns;
    }*/

    public int getLastFoundIndex() {
        return lastFoundIndex;
    }

    public void setLastFoundIndex(int lastFoundIndex) {
        this.lastFoundIndex = lastFoundIndex;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }
/* public String getBeanName() {
        return class.getName(); }*/ // если я вызываю из ребенка, мне вернется имя ребенка или имя родителя?

    public Class getClazz() {
        return getClass();
    }

    public void find(Object bean, String[] selectedColumnsForSearch) {

        DataTable dataTableWhereSearching = ((DataTableBindings) (FacesUtils.getManagedBean("dataTableBindings"))).getTable(bean.getClass());

        //      String[] selectedColumnsForSearch = new String[dataTableWhereSearching.getColumns().size()];
        int index = 0;
        for (Column col : dataTableWhereSearching.getColumns()) {
            selectedColumnsForSearch[index++] = col.getId();
        }
        int newFoundIndex = dataTableWhereSearching.findRow(searchQuery, selectedColumnsForSearch, lastFoundIndex + 1);

        if (newFoundIndex < 0) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(dataTableWhereSearching.getClientId(context),
                    new FacesMessage("Search starting at index " + (lastFoundIndex + 1) + " for \"" + searchQuery + "\" did not return a result."));
            return;
        }

        lastFoundIndex = newFoundIndex;

        dataTableWhereSearching.navigateToRow(lastFoundIndex, DataTable.SearchEffect.HIGHLIGHT);
        dataTableWhereSearching.navigateToRow(lastFoundIndex, DataTable.SearchEffect.PULSATE);
    }

    public void reset(javax.faces.event.ActionEvent e) {
        lastFoundIndex = -1;
    }


}
/*
    String[] selectedColumnsForSearch = new String[]{"id"};
    int index = 0;
        for (Column col : iceTable.getColumns()) {
//    selectedColumnsForSearch[index++] = col.;*/
