package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.InterfFunctNaClasse;

@RestController
@RequestMapping("/interFuncNaClasse")
public class InterfFunctNaClasseController {

	@Autowired
	private InterfFunctNaClasse interFunc;

	public InterfFunctNaClasseController(InterfFunctNaClasse interFunc) {
		this.interFunc = interFunc;
	}

	@GetMapping
	public ResponseEntity<Double>  getInt() {
		Double calc = this.interFunc.multiplyMeth(11.0, 30.0);
		
		return ResponseEntity.ok(calc);
	}

}
