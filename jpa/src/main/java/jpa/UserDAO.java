package jpa;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by WEO on 9/9/16.
 */
public class UserDAO {
    private EntityManager entityManager = Persistence.createEntityManagerFactory("userPersistenceUnit").createEntityManager();

    public List getUsers(){
        return entityManager.createQuery("select usr from UserEntity usr").getResultList();
    }
}
