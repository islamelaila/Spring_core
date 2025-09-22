package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class MangerService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("your manger name is save " + name);
		
	}

	@Override
	public void update(String name) {
		System.out.println("your manger name is update " + name);
		
	}
		
	}

