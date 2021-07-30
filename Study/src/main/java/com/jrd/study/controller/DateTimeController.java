package com.jrd.study.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.DataTimeImpl;

@RestController
@RequestMapping("/dates")
public class DateTimeController {
    @Autowired
	private DataTimeImpl dataTimeImpl;

	public DateTimeController(DataTimeImpl dataTimeImpl) {
		this.dataTimeImpl = dataTimeImpl;
	}
	
	
	@GetMapping("/datetime4")
	@ResponseBody
	public Period getDataTime4() {
		return this.dataTimeImpl.datetime4();
	}
	
	@GetMapping("/datetime3")
	@ResponseBody
	public LocalDate getDateTime3() {
		return this.dataTimeImpl.datetime3();
	}
	
	
	@GetMapping("datetime2")
	@ResponseBody
	public Duration getDateTime2() throws InterruptedException {
	  return this.dataTimeImpl.datetime2();
	}
	
	@GetMapping("datetime1")
	@ResponseBody
	public Instant getDateTime1() {
	  return this.dataTimeImpl.datetime1();
	}
    
    
}
