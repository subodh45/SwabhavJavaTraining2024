package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationsTest2 {

	@Test
	void testAddition() {
		
		Operations operation = new Operations();
		assertEquals(30,operation.addition(10, 20));
	}

	
}
