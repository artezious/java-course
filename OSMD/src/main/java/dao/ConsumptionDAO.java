package dao;

import model.ConsumptionEntity;
import model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class ConsumptionDAO {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("osmdPersistenceUnit").createEntityManager();
    public List<ConsumptionEntity> getUsers() {
        return entityManager.createQuery("Select Consumption from ConsumptionEntity consumption").getResultList();
    }
}
