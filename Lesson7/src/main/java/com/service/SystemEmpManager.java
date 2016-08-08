package com.service;


import com.models.ManagerEmpl;
import com.models.SimpleEmpl;

import java.util.Arrays;

public class SystemEmpManager {

    private SimpleEmpl simplEmplDB[] = new SimpleEmpl[0];

    public SimpleEmpl[] getSimplEmplDB() {
        return simplEmplDB;
    }

    public void setSimplEmplDB(SimpleEmpl[] simplEmplDB) {
        this.simplEmplDB = simplEmplDB;
    }

    ///// добавление нового сотрудника - использование механизм копирования массива меньшей длины
    /// в массив длинной = старый+1 ячейка

    public void addNewEmpl(SimpleEmpl newEmpl) {
        simplEmplDB = Arrays.copyOf(simplEmplDB, simplEmplDB.length + 1);

        simplEmplDB[simplEmplDB.length - 1] = newEmpl;

    }

    public ManagerEmpl[] getAllManagersByName(String managerNameForSearch) {

        ManagerEmpl managers[] = new ManagerEmpl[0];

        for (SimpleEmpl simpleEmpl : simplEmplDB) {
            if (simpleEmpl.getManager() != null) {
                if (simpleEmpl.getManager().getName().equals(managerNameForSearch)) {
                    managers = Arrays.copyOf(managers, managers.length + 1);
                    managers[managers.length - 1] = simpleEmpl.getManager();

                }
            }
        }
        return managers;

    }
}

