package com.yodel.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yodel.calculator.service.CalculatorService;

@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorServiceImpl;
	
	@GetMapping("/interest/{principle}")
	public BigDecimal getInterest(@PathVariable String principle) {
		return calculatorServiceImpl.getInterest(new BigDecimal(principle));
	}

}
