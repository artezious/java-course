package dao;

import model.StatementEntity;
import model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class StatementDAO {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("osmdPersistenceUnit").createEntityManager();
    public List<StatementEntity> getStatement() {
        return entityManager.createQuery("Select Statement from StatementEntity statement").getResultList();
    }
}
