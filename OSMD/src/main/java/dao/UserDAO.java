package dao;

import model.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/12/16.
 */
public class UserDAO {
    private final EntityManager entityManager = Persistence.createEntityManagerFactory("persistence.xml").createEntityManager();
    public List<UserEntity> getUsers() {
        return entityManager.createQuery("Select User from UserEntity user").getResultList();
    }
}
