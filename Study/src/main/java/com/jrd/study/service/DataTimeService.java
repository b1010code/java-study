package com.jrd.study.service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public interface DataTimeService {
	public Period datetime4();
	public LocalDate datetime3();
	public Duration datetime2() throws InterruptedException;
	public Instant datetime1();
	
}
