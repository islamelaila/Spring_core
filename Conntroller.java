package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Conntroller implements ApplicationService {


   
	private ApplicationService applicationService;
	
	
	/*
	 // field DI
	@Autowired
    private @Qualifier("accountService") ApplicationService applicationService;
    */
    
    
   

    
    // constructor 
	// not order to put @Autowire cuz must enter from constructor but for clean code put
     
	@Autowired
    public Conntroller( @Qualifier("accountService") ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    
    

    /*
     // setter DI
    @Autowired
	public void setApplicationService(@Qualifier("accountService") ApplicationService applicationService) {
		this.applicationService = applicationService;
	}
	*/

    @Override
    public void startApplication() {
        applicationService.startApplication();
    }


    
}
