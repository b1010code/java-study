package com.jrd.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	@GetMapping("/persontwo")
	public ResponseEntity<List<PersonTwo>> findAll() {
		List<PersonTwo> list = testingService.clientes();

		return ResponseEntity.ok(list);
	}

	@GetMapping("/array")
	public ResponseEntity<List<Integer>> getArr() {
		List<Integer> list = this.testingService.arr();

		return ResponseEntity.ok(list);
	}

	@GetMapping("/stream1")
	public ResponseEntity<List<Integer>> getStream() {
		List<Integer> list = this.testingService.stream1();

		return ResponseEntity.ok(list);
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
