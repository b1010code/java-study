package com.jrd.study.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.OptionalService;

@RestController
@RequestMapping("/optional")
public class OptionalController {
  
	@Autowired
	private OptionalService optionalService;

	public OptionalController(OptionalService optionalService) {
		this.optionalService = optionalService;
	}
	
	@GetMapping
	@ResponseBody
	public Optional<Integer> findOptional(){
		return this.optionalService.converOptLamb();
	}
	
	
}
