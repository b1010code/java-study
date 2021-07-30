package com.jrd.study.service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

@Service
public class DataTimeImpl {
	
	
    // return period between date1 and date2
	public Period datetime4() {
		LocalDate date1 = LocalDate.of(1990, 2, 10);
		LocalDate date2 = LocalDate.of(2016, 9, 8); 
		
		Period period = Period.between(date1, date2);

		return period;
	}
	
	
	public LocalDate datetime3() {
		LocalDate local = LocalDate.now();

		return local;
	}

	// it will take in 5 second for load
	public Duration datetime2() throws InterruptedException {
		
		Thread.sleep(5000);
		Instant now = Instant.now();

		Instant now2 = Instant.now();
		Duration dur = Duration.between(now, now2);

		return dur;
	}

	public Instant datetime1() {
		Instant now = Instant.now();

		return now;
	}
}
