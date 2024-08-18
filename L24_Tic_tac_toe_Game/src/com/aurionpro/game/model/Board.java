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
		//Player 1 win
		for (int i = 0; i < 3; i++) {
	        if ((board[i][0]==Marker.O && board[i][1]==Marker.O && board[i][2] == Marker.O) ||
	            (board[0][i]==Marker.O && board[1][i]==Marker.O && board[2][i] == Marker.O)) {
	        	System.out.println("Player 1 win");
	                return true;
	            }
	        //player 2 win
	        if ((board[i][0]==Marker.X && board[i][1]==Marker.X && board[i][2] == Marker.X) ||
		            (board[0][i]==Marker.X && board[1][i]==Marker.X && board[2][i] == Marker.X)) {
		        	System.out.println("Player 2 win");
		                return true;
		            }
	        }
		
		if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
		        (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
		        if (board[1][1] != Marker._) {
		            System.out.println((board[1][1] == Marker.O ? "Player 1" : "Player 2") + " win");
		            return true;
		        }
		    }
	       
		return false;
	}
}	
//		if (board[0][0] == Marker.O && board[0][1] == Marker.O && board[0][2] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[1][0] == Marker.O && board[1][1] == Marker.O && board[1][2] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[2][0] == Marker.O && board[2][1] == Marker.O && board[2][2] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[0][0] == Marker.O && board[1][0] == Marker.O && board[2][0] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[0][1] == Marker.O && board[1][1] == Marker.O && board[2][1] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[0][2] == Marker.O && board[1][2] == Marker.O && board[2][2] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[0][0] == Marker.O && board[1][1] == Marker.O && board[2][2] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//		if (board[0][2] == Marker.O && board[1][1] == Marker.O && board[2][0] == Marker.O) {
//			System.out.println("Player 1 win");
//			return true;
//		}
//
//		if (board[0][0] == Marker.X && board[0][1] == Marker.X && board[0][2] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[1][0] == Marker.X && board[1][1] == Marker.X && board[1][2] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[2][0] == Marker.X && board[2][1] == Marker.X && board[2][2] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[0][0] == Marker.X && board[1][0] == Marker.X && board[2][0] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[0][1] == Marker.X && board[1][1] == Marker.X && board[2][1] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[0][2] == Marker.X && board[1][2] == Marker.X && board[2][2] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[0][0] == Marker.X && board[1][1] == Marker.X && board[2][2] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//		if (board[0][2] == Marker.X && board[1][1] == Marker.X && board[2][0] == Marker.X) {
//			System.out.println("Player 2 win");
//			return true;
//		}
//
//		return false;
//	}
//}
