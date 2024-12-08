package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext(" collectionconfig.xml");
        Emp Emp1=(Emp) context.getBean("Emp",Emp.class);
        System.out.println(Emp1);
    }
}
