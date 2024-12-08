package com.Practice;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            GreetingService greetingService = (GreetingService) context.getBean("greetingService",GreetingService.class);
            System.out.println(greetingService);
        }
    }
