package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*  
		// config xml
		ClassPathXmlApplicationContext applicationContext =
			    new ClassPathXmlApplicationContext("applicationContext.xml");
			    
			    */
		

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		/*
		 BankService bankService = applicationContext.getBean("bank",BankService.class);
		 
		 AccountService accountService = applicationContext.getBean("account",AccountService.class);
		
		 
		 bankService.startApplication();
		 accountService.startApplication();
		 */
		
		  /* 
		Conntroller conntroller = applicationContext.getBean("conntroller",Conntroller.class);
	
			
		conntroller.startApplication();
	 // System.out.println(bankService.getName());
		applicationContext.close();
		*/
			
		
		AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
		accountService.startApplication();
	}

}
 