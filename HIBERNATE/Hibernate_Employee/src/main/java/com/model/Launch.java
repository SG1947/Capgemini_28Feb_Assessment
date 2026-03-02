package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        Employee emp = new Employee(10, "Rohit", "rohit@gmail.com",
                "9999999999", 45000);
        s.persist(emp);

        Employee e = s.get(Employee.class, 10);
        if (e != null) {
            System.out.println("Fetched: " + e);
        }

        if (e != null) {
            e.setSalary(60000);
            s.merge(e);
            System.out.println("Salary Updated");
        }


        Employee empToDelete = s.get(Employee.class, 10);
        if (empToDelete != null) {
            s.remove(empToDelete);
            System.out.println("Employee Deleted");
        }

        t.commit();

        s.close();
        sf.close();
    }
}
