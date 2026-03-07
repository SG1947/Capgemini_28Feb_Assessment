package com.hibernatejpa.hibernatejpa.dao;

import com.hibernatejpa.hibernatejpa.entity.Order;

import jakarta.persistence.*;

public class OrderDAOImpl {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public void updateOrder(Order order) {

        et.begin();
        em.merge(order);
        et.commit();
    }

    public Order getOrderById(int id) {

        EntityManager em = emf.createEntityManager();
        Order order = em.find(Order.class, id);

        return order;
    }
}