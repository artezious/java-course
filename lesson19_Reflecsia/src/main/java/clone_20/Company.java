package clone_20;

import java.io.Serializable;

/**
 * Created by WEO on 8/26/16.
 */
public class Company implements Cloneable, Serializable {

    private String companyName;

    public Company(Company companyName) {
        this.companyName = companyName.getCompanyName();
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
