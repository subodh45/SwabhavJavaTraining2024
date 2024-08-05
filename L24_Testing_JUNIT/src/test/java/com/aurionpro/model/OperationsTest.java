package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {

	Operations operation;
	
	@BeforeEach
	public void init()
	{
		 operation = new Operations();
	}
	
	@AfterEach
	public void finish()
	{
		System.out.println("Finished execution.");
	}
	
	@Test
	void testAddition() {
		
		assertEquals(30,operation.addition(10, 20));
	}

	@Test
	void testSubstraction() {
		
		assertEquals(10,operation.substraction(20, 10));
	}

	@Test
	void testMultiplication() {
		
		assertEquals(200,operation.multiplication(10, 20));
	}

	@Test
	void testDivison() {
	
		assertEquals(0,operation.divison(10, 20));
		assertThrows(ArithmeticException.class,()-> operation.divison(10,0));
	}
	
	@Test
	void testSquareArray()
	{
		int[]squares = {25,36,64};
		int[]numbers = {5,6,8};
		assertArrayEquals(squares,operation.squareArray(numbers));
	}

	@Test
	public void testIsEven()
	{
		assertTrue(operation.isEven(6));
	}
}
