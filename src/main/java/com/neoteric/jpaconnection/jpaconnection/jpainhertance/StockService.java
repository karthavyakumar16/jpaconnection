package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StockService {

    private EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Jpainhertance");


    public void saveStock(StockEntity stock) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(stock);
        em.getTransaction().commit();
        em.close();
    }

    public StockEntity getStock(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        StockEntity stock = em.find(StockEntity.class, id);
        em.close();
        return stock;
    }

}
