package com.aurionpro.game.model;

import java.util.Scanner;

public class Players extends Board {
	Scanner scanner = new Scanner(System.in);

	public Players(Marker[][] board) {
		super(board);
		// TODO Auto-generated constructor stub
	}

	public static int getColumn(Scanner scanner) {
		System.out.println("enter column position ");
		return scanner.nextInt();
	}

	public static int getRow(Scanner scanner) {
		System.out.println("enter row position ");
		return scanner.nextInt();
	}

	public static boolean putValue(int row, int column, Marker marker) {

		if (board[row][column] == marker.O || board[row][column] == marker.X) {
			System.out.println("Sorry ! place  is Already filled. choose another place.");
			return false;
		}
		board[row][column] = marker;
		return true;
	}

}
