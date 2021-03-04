package domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaDao <E>{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade1");
    EntityManager em = emf.createEntityManager();


    public E findByName(Class <E> clazz, String name){
        em.getTransaction().begin();
        E entity = em.find(clazz, name);
        em.getTransaction().commit();
        em.clear();
        return entity;
    }
 }