package com.Demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ABCD classABCD = context.getBean(ABCD.class);
        System.out.println(classABCD);
        XYZ classXYZ = context.getBean(XYZ.class);
        System.out.println(classXYZ);
    }
}