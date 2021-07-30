package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public int year(Car car) {
		return this.methodsParametersImpl.changeYearCar(car);
	}
	
	@GetMapping("/morning")
	@ResponseBody
	public String goodMorning(String gm, String name) {
		return this.methodsParametersImpl.goodMorning(gm, name);
	}
	
	@GetMapping("/message")
	@ResponseBody
	public String message(String msg) {
		return this.methodsParametersImpl.sendMessage(msg);
	}
	
	
	
}

























