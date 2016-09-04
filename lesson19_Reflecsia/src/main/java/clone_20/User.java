package clone_20;

import java.io.Serializable;

/**
 * Created by WEO on 8/26/16.
 */
public class User implements Cloneable, Serializable {


    private static final long serialVersionUID = 5738488721843388853L;

    private String name;
    private String surName;
    private Company company;
 //   transient private Company company; // transient - делает поле прозрачным для клонирования

    public User(String name, String surName, Company company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public User(User userForClone) {
        this.name = userForClone.getName();
        this.surName = userForClone.getSurName();
    }

    public User() {
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return surName != null ? surName.equals(user.surName) : user.surName == null;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", company=" + company +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User clone = (User)  super.clone();
        Company companyForClone = (Company) company.clone();
        clone.setCompany(companyForClone);
        return clone;
    }
}
