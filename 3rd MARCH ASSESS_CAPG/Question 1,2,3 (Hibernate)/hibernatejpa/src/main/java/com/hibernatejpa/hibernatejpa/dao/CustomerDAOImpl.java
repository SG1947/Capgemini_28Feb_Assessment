package com.hibernatejpa.hibernatejpa.dao;

import java.util.List;

import com.hibernatejpa.hibernatejpa.entity.Customer;

import jakarta.persistence.*;

public class CustomerDAOImpl {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public void insertCustomer(Customer customer) {
        et.begin();
        em.persist(customer);
        et.commit();
    }
    public void updateCustomer(Customer customer) {
        et.begin();
        em.merge(customer);
        et.commit();
    }

    public void deleteCustomer(int id) {

        et.begin();
        Customer customer = em.find(Customer.class, id);
        if(customer != null) {
            em.remove(customer);
        }
        et.commit();
    }

    public Customer getCustomerById(int id) {

        EntityManager em = emf.createEntityManager();
        Customer customer = em.find(Customer.class, id);

        return customer;
    }

    public List<Customer> getAllCustomers() {

        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Customer c");
        List<Customer> list= query.getResultList();
        return list;
    }
}
