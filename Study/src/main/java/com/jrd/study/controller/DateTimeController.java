package com.jrd.study.controller;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.DataTimeService;

@RestController
@RequestMapping("/dates")
public class DateTimeController {
	@Autowired
	private DataTimeService dataTimeService;

	public DateTimeController(DataTimeService dataTimeService) {
		this.dataTimeService = dataTimeService;
	}

	@GetMapping("/datetime4")
	@ResponseBody
	public ResponseEntity<Period>  getDataTime4() {
		Period period = this.dataTimeService.datetime4();
		
		return ResponseEntity.ok(period);
	}

	@GetMapping("/datetime3")
	@ResponseBody
	public ResponseEntity<LocalDate>  getDateTime3() {
		LocalDate locaDate = this.dataTimeService.datetime3();
		
		return ResponseEntity.ok(locaDate);
	}

	@GetMapping("datetime2")
	@ResponseBody
	public ResponseEntity<Duration>  getDateTime2() throws InterruptedException {
		Duration duration = this.dataTimeService.datetime2();
		
		return ResponseEntity.ok(duration);
	}

	@GetMapping("datetime1")
	@ResponseBody
	public ResponseEntity<Instant>  getDateTime1() {
		Instant instant = this.dataTimeService.datetime1();
		
		return ResponseEntity.ok(instant);
	}

}




