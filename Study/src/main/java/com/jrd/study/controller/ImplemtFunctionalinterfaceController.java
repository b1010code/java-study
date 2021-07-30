package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.ImplemtFunctionalinterface;

@RestController
@RequestMapping("/inferface")
public class ImplemtFunctionalinterfaceController {
	@Autowired
    private ImplemtFunctionalinterface funtionalInterface;

	public ImplemtFunctionalinterfaceController(ImplemtFunctionalinterface funtionalInterface) {
		this.funtionalInterface = funtionalInterface;
	}
	
	@GetMapping
	public float getCalc() {
	  return funtionalInterface.calculator(3.0f, 4.3f);
	}
    
    
}
