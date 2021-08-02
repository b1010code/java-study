package com.jrd.study.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.ReduceStreamsService;

@RestController
@RequestMapping("/reduces")
public class ReduceStreamsController {
	
	@Autowired
	private ReduceStreamsService reduceStreamsService;

	public ReduceStreamsController(ReduceStreamsService reduceStreamsService) {
		this.reduceStreamsService = reduceStreamsService;
	}
	
	@GetMapping("/reducestr")
	public ResponseEntity<Optional<String>>   getStr() {
	  Optional<String> str = this.reduceStreamsService.reduceString();
	  
	  return ResponseEntity.ok(str);
	}
	
	@GetMapping("/reducemult")
	public  ResponseEntity<Optional<Integer>> getRedMult(){
		Optional<Integer>mult = this.reduceStreamsService.reduceMultiply();
		
		return ResponseEntity.ok(mult);
	}
	
	@GetMapping("/reducsum")
	public ResponseEntity<Optional<Integer>> getRedSum(){
		Optional<Integer> obj = this.reduceStreamsService.reduceSum();
		
		return ResponseEntity.ok(obj);
	}
	
}
