package com.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller implements UserService {

	private UserService userService  ;

	public Controller(@Qualifier("personService") UserService userService) {
		this.userService = userService;
	}

	
	
	
	
	
	
	
	
	
	@Override
	public void save(String name) {
		
		userService.save(name);
	}

	@Override
	public void update(String name) {

		userService.update(name);
	}
	
	
	
	
	
	
	
}
