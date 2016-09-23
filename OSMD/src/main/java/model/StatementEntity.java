package model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by WEO on 9/12/16.
 */

@Entity
@Table(name = "STATEMENT")
public class StatementEntity implements Serializable {

    private static final long serialVersionUID = 3162663495332691934L;
    private int id;
    private Double debt;
    private PaymentEntity paymentEntity;
    private UserEntity userEntity;

    public StatementEntity() {
    }

    @ManyToOne
    @JoinColumn(name = "User_ID")
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @ManyToOne
    @JoinColumn(name = "Payment_ID")
    public PaymentEntity getPaymentEntity() {
        return paymentEntity;
    }

    public void setPaymentEntity(PaymentEntity paymentEntity) {
        this.paymentEntity = paymentEntity;
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
    @Column(name = "DEBT", nullable = true, precision = 0)
    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "StatementEntity{" +
                "id=" + id +
                ", debt=" + debt +
                ", paymentEntity=" + paymentEntity +
                ", userEntity=" + userEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatementEntity)) return false;

        StatementEntity that = (StatementEntity) o;

        if (id != that.id) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;
        if (paymentEntity != null ? !paymentEntity.equals(that.paymentEntity) : that.paymentEntity != null)
            return false;
        return userEntity != null ? userEntity.equals(that.userEntity) : that.userEntity == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        //      result = 31 * result + (paymentEntity != null ? paymentEntity.hashCode() : 0);
        //      result = 31 * result + (userEntity != null ? userEntity.hashCode() : 0);
        return result;
    }
}
