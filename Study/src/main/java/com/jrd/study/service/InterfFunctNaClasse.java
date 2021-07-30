package com.jrd.study.service;

import org.springframework.stereotype.Service;

@FunctionalInterface
interface FuncitonalPrint {
	double apply2(double numb1, double numb2);
}

// observaçao caso vier dados da model não esquecer de injetar o repository aqui

@Service
public class InterfFunctNaClasse {
	public double multiplyMeth(double numb1, double numb2) {
		FuncitonalPrint multiply = (a, b) -> a * b;

		return multiply.apply2(numb1, numb2);

	}
	
	
	
	
	
	
	
}



















