package com.jrd.study.service;

import org.springframework.stereotype.Service;

@Service
public class ImplemtFunctionalinterface {

	public float calculator(float numb1, float numb2) {

		Functionalinterface calc = (a, b) -> a * b;
		return calc.apply(numb1, numb2);
	}

}
