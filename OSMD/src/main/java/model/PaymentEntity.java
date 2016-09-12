package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by WEO on 9/12/16.
 */
@Entity
@Table(name = "PAYMENT", schema = "PUBLIC", catalog = "DATABASES")
public class PaymentEntity {
    private int id;
    private Double paid;
    private Date paymentDate;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAID", nullable = true, precision = 0)
    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    @Basic
    @Column(name = "PAYMENT_DATE", nullable = true)
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentEntity that = (PaymentEntity) o;

        if (id != that.id) return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        if (paymentDate != null ? !paymentDate.equals(that.paymentDate) : that.paymentDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (paymentDate != null ? paymentDate.hashCode() : 0);
        return result;
    }
}
