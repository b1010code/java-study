package com.jrd.study.service;

import org.springframework.stereotype.Service;

import com.jrd.study.model.Car;

@Service
public class MethodsParametersImpl {

	public int changeYearCar(Car car) {
		car.year = 1988;

		return car.year + 1;

	}

	public String goodMorning(String gm, String name) {
		name = "Gilberto";

		gm = "Good morning ! " + name;
		return gm;
	}

	public String sendMessage(String msg) {
		msg = "Sending message function";
		return msg;

	}
}
