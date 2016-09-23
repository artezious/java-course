package controller;

import org.icefaces.ace.component.datatable.DataTable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@RequestScoped
// Created because MyFaces has id generation issues with non-request scoped
// component bindings.
public class DataTableBindings {
    // Need multiple tables to bind to, as binding to the same table
    // even if the bean is request scoped, causes id errors.
    // MyFaces component binding is very deficient.
    Map<Class, DataTable> tables = new HashMap<Class, DataTable>();

    public Map<Class, DataTable> getTables() {
        return tables;
    }

    public void setTables(Map<Class, DataTable> tables) {
        this.tables = tables;
    }

    public DataTable getTable(Class c) {
        return tables.get(c);
    }
}
