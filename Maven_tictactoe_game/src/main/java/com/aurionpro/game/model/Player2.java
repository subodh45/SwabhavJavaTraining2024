package com.aurionpro.game.model;

public class Player2 extends Players {

	public Player2(Marker[][] board) {
		super(board);
		// TODO Auto-generated constructor stub
	}

	public boolean addValue() {
		System.out.println("Player2 as X ");
		int row = getRow(scanner);
		if (row >= 3) {
			System.out.println("Please  enter row position as 0 ,1 or 2.");
			return false;
		}
		int column = getColumn(scanner);
		if (column >= 3) {
			System.out.println("Please enter column position as 0 ,1 or 2.");
			return false;
		}
		return putValue(row, column, Marker.X);
	}
}