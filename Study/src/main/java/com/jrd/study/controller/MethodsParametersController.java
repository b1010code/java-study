package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.model.Car;
import com.jrd.study.service.MethodsParametersImpl;

@RestController
@RequestMapping("/methsparam")
public class MethodsParametersController {

	@Autowired
	private MethodsParametersImpl methodsParametersImpl;

	public MethodsParametersController(MethodsParametersImpl methodsParametersImpl) {
		this.methodsParametersImpl = methodsParametersImpl;
	}
	
	@GetMapping("/car")
	@ResponseBody        // model private ?
	public ResponseEntity<Integer>  year(Car car) {
		Integer year = this.methodsParametersImpl.changeYearCar(car);
		
		return ResponseEntity.ok(year);
	}
	
	@GetMapping("/morning")
	@ResponseBody
	public ResponseEntity<String>  goodMorning(String gm, String name) {
		String good = this.methodsParametersImpl.goodMorning(gm, name);
		
		return ResponseEntity.ok(good);
	}
	
	@GetMapping("/message")
	@ResponseBody
	public ResponseEntity<String>  message(String msg) {
		String mes = this.methodsParametersImpl.sendMessage(msg);
		
		return ResponseEntity.ok(mes);
	}
	
	
	
}

























