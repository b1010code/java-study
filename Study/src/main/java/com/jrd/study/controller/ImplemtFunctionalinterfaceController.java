package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.ImplemtFunctionalinterface;

@RestController
@RequestMapping("/functionalInferface")
public class ImplemtFunctionalinterfaceController {
	@Autowired
    private ImplemtFunctionalinterface funtionalInterface;

	public ImplemtFunctionalinterfaceController(ImplemtFunctionalinterface funtionalInterface) {
		this.funtionalInterface = funtionalInterface;
	}
	
	@GetMapping
	public ResponseEntity<Float>  getCalc() {
	  Float calc =  funtionalInterface.calculator(3.0f, 4.3f);
	  
	  return ResponseEntity.ok(calc);
	}
    
    
}
