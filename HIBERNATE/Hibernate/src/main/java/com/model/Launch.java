package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

//        Employee emp = new Employee(5, "Rohit", "rohit@gmail.com", "9999999999");
//        s.persist(emp);  

        Employee e = s.get(Employee.class, 10);
        System.out.println(e);

       
        e.setName("Rahul");
        s.merge(e);  

       
//        Employee empToDelete = s.get(Employee.class, 5);
//        if (empToDelete != null) {
//            s.remove(empToDelete);
//        }

        t.commit();

        s.close();
        sf.close();
    }
}
