package org.example;

import org.example.models.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee e = context.getBean("e1",Employee.class);
        System.out.println(e);

    }
}