package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.model.PersonTwo;
import com.jrd.study.service.StreamsService;

@RestController
@RequestMapping("/clientes")
public class StreamsController {

	@Autowired
	private StreamsService testingService;

	public StreamsController(StreamsService testingService) {
		this.testingService = testingService;
	}

	@GetMapping
	public List<PersonTwo> findAll() {
		return testingService.clientes();
	}

	@GetMapping("/array")
	public List<Integer> getArr() {
		return this.testingService.arr();
	}
	
	/*
	@GetMapping("/thread")
	public String getThread() {
		return this.testingService.threadMeth();
	}  */
	
	
	@GetMapping("/stream1")
	public List<Integer>getStream(){
		return this.testingService.stream1();
	}
	
	@GetMapping("/stream2")
	public void getStream2() {
		 this.testingService.stream2();
	}
	
	@GetMapping("/stream3")
	public void getStream3() {
		 this.testingService.stream3();
	}
	
	@GetMapping("/collect")
	public void getCollect() {
		 this.testingService.collect1();
	}
	
	@GetMapping("/collect2")
	public void getCollect2() {
		 this.testingService.collect2();
	}
	
	
	
	
	
	
	
	
	

}
