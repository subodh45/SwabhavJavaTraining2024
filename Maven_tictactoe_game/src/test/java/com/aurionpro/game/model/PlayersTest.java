package com.aurionpro.game.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayersTest {
	Scanner scanner;
	
	Board game;
	@BeforeEach
	void setUp() throws Exception {
	
		Marker board[][] = { { Marker.O, Marker.X, Marker.X}, { Marker.O, Marker.X, Marker.O },
				{ Marker.X, Marker.O, Marker._} };
		game = new Board(board);
	}

	

	@Test
	void testPutValue() {
		assertEquals(true, Players.putValue(2, 2, Marker.O));
		
	}
	
	@Test
	void testPutValue2() {
		assertEquals(true, Players.putValue(1, 2, Marker.O));
		
	}
	

}
