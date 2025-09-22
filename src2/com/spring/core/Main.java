package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	
    	
  /*
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonService personService = applicationContext.getBean("person",PersonService.class);
        
        personService.update("killua");
        applicationContext.close();
*/
        
    	
    	
        
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        PersonService personService = applicationContext.getBean("personService",PersonService.class);

        
        personService.update("killua");
        applicationContext.close();        
    
    }
}
