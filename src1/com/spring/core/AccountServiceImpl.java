package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements UserService {

    private PersonService personService;


    
    public AccountServiceImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void save(String name) {
        personService.save(name);
    }

    @Override
    public void update(String name) {
        System.out.println("AccountServiceImpl: updated " + name);
    }
}
