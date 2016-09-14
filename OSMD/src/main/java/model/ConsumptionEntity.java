package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
@Entity
@Table(name = "CONSUMPTION", schema = "PUBLIC", catalog = "DATABASES")
public class ConsumptionEntity {
    private int id;
    private Integer lv;
    private Integer rtv;
    private Integer consumed;
    private Integer totalConsumed;
    private ServiceEntity serviceEntities;

    @ManyToOne(optional = false)
    @JoinTable(name = "SERVICE")
    @JoinColumn(name = "SERVICE_ID")
    public ServiceEntity getServiceEntities() {
        return serviceEntities;
    }

    public void setServiceEntities(ServiceEntity serviceEntities) {
        this.serviceEntities = serviceEntities;
    }

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LV", nullable = true)
    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    @Basic
    @Column(name = "RTV", nullable = true)
    public Integer getRtv() {
        return rtv;
    }

    public void setRtv(Integer rtv) {
        this.rtv = rtv;
    }

    @Basic
    @Column(name = "CONSUMED", nullable = true)
    public Integer getConsumed() {
        return consumed;
    }

    public void setConsumed(Integer consumed) {
        this.consumed = consumed;
    }

    @Basic
    @Column(name = "TOTAL_CONSUMED", nullable = true)
    public Integer getTotalConsumed() {
        return totalConsumed;
    }

    public void setTotalConsumed(Integer totalConsumed) {
        this.totalConsumed = totalConsumed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConsumptionEntity)) return false;

        ConsumptionEntity that = (ConsumptionEntity) o;

        if (id != that.id) return false;
        if (lv != null ? !lv.equals(that.lv) : that.lv != null) return false;
        if (rtv != null ? !rtv.equals(that.rtv) : that.rtv != null) return false;
        if (consumed != null ? !consumed.equals(that.consumed) : that.consumed != null) return false;
        if (totalConsumed != null ? !totalConsumed.equals(that.totalConsumed) : that.totalConsumed != null)
            return false;
        return serviceEntities != null ? serviceEntities.equals(that.serviceEntities) : that.serviceEntities == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lv != null ? lv.hashCode() : 0);
        result = 31 * result + (rtv != null ? rtv.hashCode() : 0);
        result = 31 * result + (consumed != null ? consumed.hashCode() : 0);
        result = 31 * result + (totalConsumed != null ? totalConsumed.hashCode() : 0);
        result = 31 * result + (serviceEntities != null ? serviceEntities.hashCode() : 0);
        return result;
    }
}
