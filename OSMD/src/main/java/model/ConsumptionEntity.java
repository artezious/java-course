package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by WEO on 9/12/16.
 */

@Entity
@Table(name = "CONSUMPTION")
public class ConsumptionEntity implements Serializable {

    private static final long serialVersionUID = 6141871642725084470L;
    private int id;
    private Integer lv;
    private Integer rtv;
    private Integer consumed;
    private Integer totalConsumed;
    private ServiceEntity serviceEntity;
    private Set<PaymentEntity> paymentEntity;

    public ConsumptionEntity() {
    }

    @OneToMany(mappedBy = "consumptionEntity")
    public Set<PaymentEntity> getPaymentEntity() {
        return paymentEntity;
    }

    public void setPaymentEntity(Set<PaymentEntity> paymentEntity) {
        this.paymentEntity = paymentEntity;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "Service_ID")
    public ServiceEntity getServiceEntity() {
        return serviceEntity;
    }

    public void setServiceEntity(ServiceEntity serviceEntities) {
        this.serviceEntity = serviceEntities;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public String toString() {
        return "ConsumptionEntity{" +
                "id=" + id +
                ", lv=" + lv +
                ", rtv=" + rtv +
                ", consumed=" + consumed +
                ", totalConsumed=" + totalConsumed +
                ", serviceEntity=" + serviceEntity +
                ", paymentEntity=" + paymentEntity +
                '}';
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
        if (serviceEntity != null ? !serviceEntity.equals(that.serviceEntity) : that.serviceEntity != null)
            return false;
        return paymentEntity != null ? paymentEntity.equals(that.paymentEntity) : that.paymentEntity == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lv != null ? lv.hashCode() : 0);
        result = 31 * result + (rtv != null ? rtv.hashCode() : 0);
        result = 31 * result + (consumed != null ? consumed.hashCode() : 0);
        result = 31 * result + (totalConsumed != null ? totalConsumed.hashCode() : 0);
        //     result = 31 * result + (serviceEntity != null ? serviceEntity.hashCode() : 0);
        //     result = 31 * result + (paymentEntity != null ? paymentEntity.hashCode() : 0);
        return result;
    }
}
