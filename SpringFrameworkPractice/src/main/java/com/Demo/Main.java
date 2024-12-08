package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student student = (Student) context.getBean("Student",Student.class);
        System.out.println(student);
        Student student1= (Student) context.getBean("Student1",Student.class);
        System.out.println(student1);

    }
}