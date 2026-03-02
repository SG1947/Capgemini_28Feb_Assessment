package com.hibernate1.HibernateJPA1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        //CREATE
        et.begin();
        Customer customer = new Customer(1001, "Suman", "9999999999");
        em.persist(customer); 
        et.commit();
        System.out.println("Customer Inserted");
        
        et.begin();
        Customer customer1 = new Customer(1002, "Naman", "9999999999");
        em.persist(customer1);
        et.commit();

        //READ
        Customer c = em.find(Customer.class, 1001);
        System.out.println("Customer Found: " + c);

        // UPDATE
        et.begin();
        Customer updateCustomer =em.find(Customer.class, 1001);
        updateCustomer.setName("Neha");
        em.merge(updateCustomer);
        et.commit();
        
         //DELETE
        et.begin();
        Customer deleteCustomer = em.find(Customer.class, 1002);
        em.remove(deleteCustomer);
        et.commit();
        System.out.println("Customer Deleted");
 
        
    }
}
