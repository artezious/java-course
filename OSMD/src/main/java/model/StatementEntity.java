package model;

import javax.persistence.*;

/**
 * Created by WEO on 9/12/16.
 */
@Entity
@Table(name = "STATEMENT", schema = "PUBLIC", catalog = "DATABASES")
public class StatementEntity {
    private int id;
    private Double debt;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatementEntity that = (StatementEntity) o;

        if (id != that.id) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StatementEntity{" +
                "id=" + id +
                ", debt=" + debt +
                '}';
    }
}
