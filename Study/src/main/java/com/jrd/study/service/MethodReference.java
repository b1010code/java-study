package com.jrd.study.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// method reference :: to the method itself
		list.stream().forEach(System.out::println);

		// call method, whithout reference method
		list.stream().forEach((n) -> System.out.println(n));
		
		
		// Multiplies instances
		list.stream().map(Integer::doubleValue)
					 .forEach(System.out::println);

		list.stream().map((n) -> n.doubleValue())
		             .forEach(System.out::println);
		
		        // Unique instance
				BigDecimal three = new BigDecimal(3);

				list.stream().map(BigDecimal::new)
				             .map(three::multiply)
				             .forEach(System.out::println);

				list.stream().map(BigDecimal::new)
				             .map((b) -> three.multiply(b))
				             .forEach(System.out::println);
		

		// Contructors
		list.stream().map(BigDecimal::new)
		             .forEach(System.out::println);

		list.stream().map((n) -> new BigDecimal(n))
		             .forEach(System.out::println);

		// static method
		list.stream().map((n) -> multiplyForTwo(n))
		             .forEach(System.out::println);

	}

	private static Integer multiplyForTwo(Integer i) {
		return i * 2;
	}

}
