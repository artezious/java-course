package com.models;

public class ManagerEmpl extends Person{
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ManagerEmpl{" +
                "department= '" + department + '\'' +
                "additional information: '" + super.toString() + '\'' +
                '}';
    }
}
