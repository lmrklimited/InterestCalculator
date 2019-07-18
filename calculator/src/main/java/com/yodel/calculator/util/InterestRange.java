package com.yodel.calculator.util;

import java.math.BigDecimal;

public enum InterestRange {
	BASIC (new BigDecimal("0"), new BigDecimal("1000"), new BigDecimal("0.01")),
	MODERATE (new BigDecimal("1000"), new BigDecimal("4000"), new BigDecimal("0.02")),
	HIGH (new BigDecimal("5000"), null , new BigDecimal("0.03"));
	
	private final BigDecimal minValue;
	private final BigDecimal threshold;
	private final BigDecimal interestRate;
	
	InterestRange (BigDecimal minValue, BigDecimal threshold, BigDecimal interestRate){
		this.minValue = minValue;
		this.threshold = threshold;
		this.interestRate = interestRate;
	}

	public BigDecimal getMinValue() {
		return minValue;
	}

	public BigDecimal getThresholde() {
		return threshold;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}
	
	public BigDecimal calculateFullInterest(){
		return threshold.multiply(interestRate);
	}
	
	public BigDecimal calculateInterest(BigDecimal value){
		return value.multiply(interestRate);
	}
	
	

}
