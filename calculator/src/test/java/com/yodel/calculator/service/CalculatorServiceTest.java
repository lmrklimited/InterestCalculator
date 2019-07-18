package com.yodel.calculator.service;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.yodel.calculator.service.impl.CalculatorServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	CalculatorServiceImpl calculatorService;
	
	@Test
	public void testHighInterest(){
		BigDecimal interest = calculatorService.getInterest(new BigDecimal("6400"));
		assertTrue(interest.compareTo(new BigDecimal("132")) == 0);
	}
	
	@Test
	public void testModerateInterest(){
		BigDecimal interest = calculatorService.getInterest(new BigDecimal("3400"));
		assertTrue(interest.compareTo(new BigDecimal("58")) == 0);
	}
	
	@Test
	public void testLowInterest(){
		BigDecimal interest = calculatorService.getInterest(new BigDecimal("400"));
		assertTrue(interest.compareTo(new BigDecimal("4")) == 0);
	}

}
