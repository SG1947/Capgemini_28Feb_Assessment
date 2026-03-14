package com.capg.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
      	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        People people =context.getBean(People.class);
        Bike bike = context.getBean(Bike.class);
        System.out.println(people);
        System.out.println(bike);
        
    }
}
