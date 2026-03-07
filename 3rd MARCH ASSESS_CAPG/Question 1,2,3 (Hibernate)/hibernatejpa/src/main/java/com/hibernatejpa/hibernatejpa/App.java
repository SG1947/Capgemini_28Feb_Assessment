package com.hibernatejpa.hibernatejpa;

import java.time.LocalDate;
import java.util.List;

import com.hibernatejpa.hibernatejpa.dao.CustomerDAOImpl;
import com.hibernatejpa.hibernatejpa.dao.OrderDAOImpl;
import com.hibernatejpa.hibernatejpa.entity.Customer;
import com.hibernatejpa.hibernatejpa.entity.Order;

import jakarta.persistence.*;

public class App {

    public static void main(String[] args) {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();
        
        Customer customer =new Customer(1,"Rajat","rajat@gmail.com","Male",9876543210L,LocalDate.now());
        Order order = new Order( 101,"ORD101","Laptop",1,70000,LocalDate.now());

        customer.setOrder(order);
        order.setCustomer(customer);

        // INSERT CUSTOMER WITH ORDER
        customerDAO.insertCustomer(customer);
        System.out.println("Customer inserted successfully");
        // FETCH CUSTOMER BY ID 
        Customer fetchedCustomer = customerDAO.getCustomerById(1);
        System.out.println("Customer fetched by ID:");
        System.out.println(fetchedCustomer);
        // UPDATE CUSTOMER 
        fetchedCustomer.setCustomerName("Rahul");
        customerDAO.updateCustomer(fetchedCustomer);
        System.out.println("Customer updated successfully");
        // FETCH ALL CUSTOMERS
        List<Customer> customers = customerDAO.getAllCustomers();
        System.out.println("All Customers:");
        for(Customer cust : customers) {
            System.out.println(cust);
        }

        //UPDATE ORDER 
        order.setPrice(75000);
        orderDAO.updateOrder(order);
        System.out.println("Order updated successfully");
        // FETCH ORDER BY ID 
        Order fetchedOrder = orderDAO.getOrderById(101);
        System.out.println("Order fetched by ID:");
        System.out.println(fetchedOrder);


        //QUESTION 3
        //JPQL QUERY (FETCH CUSTOMER BY EMAIL)

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT c FROM Customer c WHERE c.email = 'rajat@gmail.com'");
        Customer customerByEmail = (Customer) query.getSingleResult();

        System.out.println("Customer fetched by email:");
        System.out.println(customerByEmail);
    }
}
