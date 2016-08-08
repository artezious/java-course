package com.models;

public class SimpleEmpl extends Person {

    private String project;
    private ManagerEmpl manager;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public ManagerEmpl getManager() {
        return manager;
    }

    public void setManager(ManagerEmpl manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "SimpleEmpl{" +
                "project= '" + project + '\'' +
                ", manager= " + manager +
                ", additional info: " + super.toString() +      // притянет toString из Person
                '}';
    }
}
