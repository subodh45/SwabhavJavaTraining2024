package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCaluculator {

	AreaCalculator calculator;
	
	@BeforeEach
	public void init()
	{
		calculator = new AreaCalculator();
	}
	
	@Test
	public void testAreaOfCircle()
	{
		assertEquals(78.5, calculator.areaOfCircle(5));
	}
	
	@Test
	public void testAreaOfRectangle()
	{
		assertEquals(200, calculator.areaOfRectangle(10,20));
	}
	
	@Test
	public void testAreaofTriangle()
	{
		assertEquals(100, calculator.areaOfTringle(10,20));
	}
	
	
}
