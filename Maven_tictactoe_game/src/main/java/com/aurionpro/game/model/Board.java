package com.aurionpro.game.model;

public class Board {

	static Marker board[][];

	public Board(Marker[][] board) {
		super();
		this.board = board;
	}

	public static void display() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public  boolean checkWin() {
		if (board[0][0] == Marker.O && board[0][1] == Marker.O && board[0][2] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[1][0] == Marker.O && board[1][1] == Marker.O && board[1][2] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[2][0] == Marker.O && board[2][1] == Marker.O && board[2][2] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[0][0] == Marker.O && board[1][0] == Marker.O && board[2][0] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[0][1] == Marker.O && board[1][1] == Marker.O && board[2][1] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[0][2] == Marker.O && board[1][2] == Marker.O && board[2][2] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[0][0] == Marker.O && board[1][1] == Marker.O && board[2][2] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}
		if (board[0][2] == Marker.O && board[1][1] == Marker.O && board[2][0] == Marker.O) {
			System.out.println("Player 1 win");
			return true;
		}

		if (board[0][0] == Marker.X && board[0][1] == Marker.X && board[0][2] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[1][0] == Marker.X && board[1][1] == Marker.X && board[1][2] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[2][0] == Marker.X && board[2][1] == Marker.X && board[2][2] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[0][0] == Marker.X && board[1][0] == Marker.X && board[2][0] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[0][1] == Marker.X && board[1][1] == Marker.X && board[2][1] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[0][2] == Marker.X && board[1][2] == Marker.X && board[2][2] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[0][0] == Marker.X && board[1][1] == Marker.X && board[2][2] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}
		if (board[0][2] == Marker.X && board[1][1] == Marker.X && board[2][0] == Marker.X) {
			System.out.println("Player 2 win");
			return true;
		}

		return false;
	}
}
