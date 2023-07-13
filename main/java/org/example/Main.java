package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.startTheCar();
        System.out.println();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTheCar();
        System.out.println();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.startTheCar();

    }
}