package dao;

import model.PaymentEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class PaymentDAO {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("osmdPersistenceUnit").createEntityManager();
    public List<PaymentEntity> getPayment() {
        return entityManager.createQuery("Select Payment from PaymentEntity payment").getResultList();
    }
}
