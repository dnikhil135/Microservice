package com.nik.microservices.limitsservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nik.microservices.limitsservice.model.Cofiguration;
import com.nik.microservices.limitsservice.model.LimitConfiguration;

@RestController
public class LimitConfigurationResource {

	@Autowired
	Cofiguration cofiguration;
	
	@GetMapping("/limitConfig")
	//Testing
	public LimitConfiguration retriveLimitConfiguration() {
		return new LimitConfiguration(cofiguration.getMaximum(),cofiguration.getMinimum());
	}
}
