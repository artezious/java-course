package com.service;

import com.models.ManagerEmpl;
import com.models.SimpleEmpl;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class SystemEmpManager {

    private SimpleEmpl simpleEmplDB[] = new SimpleEmpl[0];

    public SimpleEmpl[] getSimpleEmplDB() {
        return simpleEmplDB;
    }

    public void setSimpleEmplDB(SimpleEmpl[] simpleEmplDB) {
        this.simpleEmplDB = simpleEmplDB;
    }

    /**
     * добавление нового сотрудника - использование механизм копирования
     * массива меньшей длины в массив длиной = старый_массив.длина + 1
     *
     * @param newEmpl
     */
    public void addNewEmpl(SimpleEmpl newEmpl) {
        //копирование массива длиной simpleEmplDB.length в массив с длиной simpleEmplDB.length + 1
        simpleEmplDB = Arrays.copyOf(simpleEmplDB, simpleEmplDB.length + 1);

        simpleEmplDB[simpleEmplDB.length - 1] = newEmpl;

    }


    public ManagerEmpl[] getAllManagersByName(String managerNameForSearch) {
        ManagerEmpl managers[] = new ManagerEmpl[0];

        for (SimpleEmpl simpleEmpl : simpleEmplDB) {
            ManagerEmpl manager = simpleEmpl.getManager();
            if (manager != null) {
                if (manager.getName().equals(managerNameForSearch)) {
                    managers = Arrays.copyOf(managers, managers.length + 1);
                    managers[managers.length - 1] = manager;
                }
            }
        }
        return managers;
    }


}
