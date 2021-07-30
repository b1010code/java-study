package com.jrd.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.study.service.InterfFunctNaClasse;

@RestController
@RequestMapping("/classint")
public class InterfFunctNaClasseController {

	@Autowired
	private InterfFunctNaClasse interFunc;

	public InterfFunctNaClasseController(InterfFunctNaClasse interFunc) {
		this.interFunc = interFunc;
	}

	@GetMapping
	public double getInt() {
		return this.interFunc.multiplyMeth(11.0, 30.0);
	}

}
