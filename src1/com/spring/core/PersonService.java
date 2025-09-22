package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class PersonService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("PersonService: saved " + name);
    }

    @Override
    public void update(String name) {
        System.out.println("PersonService: updated " + name);
    }
}
