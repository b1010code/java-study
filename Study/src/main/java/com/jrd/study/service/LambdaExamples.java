package com.jrd.study.service;

import java.util.stream.IntStream;

public class LambdaExamples {

	public static void main(String[] args) {

		// Simple
		IntStream.range(0, 5)
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);

		// Parentheses
		IntStream.range(0, 5)
		.filter((int n) -> n % 2 == 0)
		.reduce((n1, n2) -> n1 + n2)
		.ifPresent(System.out::println);

		// Keys
		IntStream.range(0, 5)
		.filter(n -> { return n % 2 == 0;})
		.forEach(System.out::println);

		// More Write lines
		IntStream.range(0, 5)
		.filter(n -> {	
			System.out.println("yes, i can write here !");
			return n % 2 == 0;
		}).forEach(System.out::println);

	}

}
