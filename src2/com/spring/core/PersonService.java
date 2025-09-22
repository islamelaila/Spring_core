package com.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PersonService implements UserService {

	@Value("${app_service-name}")
	    private String name ;
	
	    public String getName() {
	        return name;
	    }
	
	    public void setName(String name) {
	        this.name = name;
	    }
	
	    @PostConstruct
	    public void init() {
	        System.out.println("PersonService bean initialized with name = " + name);
	    }
	
	    @PreDestroy
	    public void destroy() {
	        System.out.println("PersonService bean destroyed");
	    }
	
	    @Override
	    public void save(String name) {
	        System.out.println("PersonService: saved " + name);
	    }
	
	    @Override
	    public void update(String name) {
	        System.out.println("PersonService: updated " + name);
    }
}