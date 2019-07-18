package com.yodel.calculator.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.yodel.calculator.service.CalculatorService;
import com.yodel.calculator.util.InterestRange;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public BigDecimal getInterest(BigDecimal principle) {
		
		BigDecimal interest;
		
		if(principle.compareTo(InterestRange.HIGH.getMinValue()) > 0) {
			interest = InterestRange.BASIC.calculateFullInterest()
					.add(InterestRange.MODERATE.calculateFullInterest())
					.add(InterestRange.HIGH.calculateInterest(principle.subtract(InterestRange.HIGH.getMinValue())));
		} else if (principle.compareTo(InterestRange.MODERATE.getMinValue()) > 0) {
			interest = InterestRange.BASIC.calculateFullInterest()
					.add(InterestRange.MODERATE.calculateInterest(principle.subtract(InterestRange.MODERATE.getMinValue())));
		} else {
			interest = InterestRange.BASIC.calculateInterest(principle.subtract(InterestRange.BASIC.getMinValue()));
		}
		
		return interest;
	}

}
