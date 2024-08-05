package com.aurionpro.game.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {

	Board game;
	@BeforeEach
	void setUp() throws Exception {
		Marker board[][] = { { Marker.O, Marker.X, Marker.X}, { Marker.O, Marker.X, Marker.O },
				{ Marker.X, Marker.O, Marker.X} };
		game = new Board(board);
	}

	
//	void testDisplay() {
//	
//		Marker board2[][] = { { Marker.O, Marker.X, Marker.X}, { Marker.O, Marker.X, Marker.O },
//				{ Marker.X, Marker.O, Marker.X} };
//		Board game2 = new Board(board2);
//		assertEquals(game2.display(),game.display());
//		
//	}

	@Test
	void testCheckWin() {
		assertFalse(game.board[0][0] == Marker.O && game.board[0][1] == Marker.O && game.board[0][2] == Marker.O, "got it");
	}

	
	@Test
	void testCheckWin2() {
		assertTrue(game.board[0][2] == Marker.X && game.board[1][1] == Marker.X && game.board[2][0] == Marker.X, "got it");
	}
}
