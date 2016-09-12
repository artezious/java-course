package dao;

import model.ServiceEntity;
import model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class ServiceDAO {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("persistence.xml").createEntityManager();
    public List<ServiceEntity> getService() {
        return entityManager.createQuery("Select Service from ServiceEntity service").getResultList();
    }
}
