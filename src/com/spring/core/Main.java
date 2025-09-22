package com.spring.core;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


	/* config xml
		
		ClassPathXmlApplicationContext applicationContext =
			    new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
			PersonService personService = applicationContext.getBean( "person" ,PersonService.class );
			personService.save("luffy");
			personService.update("killua");
	
			MangerService mangerService = applicationContext.getBean("manager",MangerService.class);
			mangerService.save("sange");
			mangerService.update("brok");

			
			
			Controller controller = applicationContext.getBean("controller",Controller.class);
			controller.save("luffy");
			controller.update("killua");
			
			*/
		
		
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
          
		PersonService personService = applicationContext.getBean("personService" ,PersonService.class);
		personService.save("luffy");
		personService.update("killua");
		
		MangerService mangerService = applicationContext.getBean("mangerService",MangerService.class);
		mangerService.save("sange");
		mangerService.update("brok");
		
		
		Controller controller = applicationContext.getBean("controller",Controller.class);
		controller.save("luffy");
		controller.update("killua");
		
		
		
			
	}

}
 