package com.jrd.study.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class OptionalServiceImpl implements OptionalService {

	public Optional<Integer> converOptLamb() {
		// Optional + Lambda
		// only print if you have numbers

		// String s = "this string try catch because is not number";
		String cn = "4";
		Optional<Integer> conv = convertInNumbOpt1(cn);

		conv.ifPresent(n -> System.out.println(n));

		// System.out.println(conv.isPresent());

		return conv;
	}

//-------------------------------------------------------//	

	public Optional<Integer> convertOpt() {
		// main use of this is to indicate whether a value is present or absent.
		// advantage no more null checks needed
		// object that may or may not contain an integer, "optional"

		// String s = "this string try catch because is not number";
		String cn = "1";
		Optional<Integer> conv = convertInNumbOpt1(cn);

		// System.out.println(conv);
		return conv;
	}

	public Optional<Integer> convertInNumbOpt1(String numberStr) {

		try {
			Integer integer = Integer.valueOf(numberStr);
			return Optional.ofNullable(integer);
		} catch (Exception e) {
			return Optional.empty();
		}

	}

	// -------------------------------------------------------------------------//

	public Integer convertNumb() {

		String cn = "1";
		Integer conv = convertInNumber(cn);

		System.out.println(conv);
		System.out.println(((Object) conv).getClass().getSimpleName()); // print variable type
		return conv;

	}

	public static Integer convertInNumber(String numeroStr) {
		return Integer.valueOf(numeroStr);
	}

//-------------------------------------------------------------//

}
