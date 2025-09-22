package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	
    	
    	/*
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountServiceImpl accountService = applicationContext.getBean("account", AccountServiceImpl.class);

        accountService.save("Luffy"); 

        applicationContext.close();
        
        */
        
        
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountServiceImpl accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);

        
        accountServiceImpl.save("luffy");
        
    
    }
}
