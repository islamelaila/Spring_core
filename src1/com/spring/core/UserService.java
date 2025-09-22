package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
	
	void save (String name);
	void update (String name);

}