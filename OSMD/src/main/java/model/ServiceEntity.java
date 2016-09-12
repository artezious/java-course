package model;

import javax.persistence.*;

/**
 * Created by WEO on 9/12/16.
 */
@Entity
@Table(name = "SERVICE", schema = "PUBLIC", catalog = "DATABASES")
public class ServiceEntity {
    private int id;
    private String servicename;
    private double tariff;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SERVICENAME", nullable = false, length = 30)
    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    @Basic
    @Column(name = "TARIFF", nullable = false, precision = 0)
    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.tariff, tariff) != 0) return false;
        if (servicename != null ? !servicename.equals(that.servicename) : that.servicename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (servicename != null ? servicename.hashCode() : 0);
        temp = Double.doubleToLongBits(tariff);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
