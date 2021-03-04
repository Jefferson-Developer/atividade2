package domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDao <G> {
    

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exemplo_PU");
    EntityManager em = emf.createEntityManager();

    public void saveOrUpdate(G entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(G entity){
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        em.close();
    }
}