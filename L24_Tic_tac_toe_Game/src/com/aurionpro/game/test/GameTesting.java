package com.aurionpro.game.test;
import java.util.Scanner;
import com.aurionpro.game.model.*;

public class GameTesting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Marker game[][] = { { Marker._, Marker._, Marker._ }, { Marker._, Marker._, Marker._ },
				{ Marker._, Marker._, Marker._ } };
		Board board = new Board(game);
		//Board board = new Player1(game);
		Player1 player1 = new Player1(game);
		Player2 player2 = new Player2(game);

		System.out.println("Welcome to TicTacToe Game :");
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				
				if(!player1.addValue())
				{
					i--;   
					board.display();
					continue;
				}
				board.display();
				
				if (board.checkWin())
					return;
			}
			if (i % 2 == 0) {
				if(!player2.addValue())
				{
				   i--;   
				   board.display();
				   continue;
				}
				board.display();
				
				if (board.checkWin())
					return;
			}
		}
	
		if(!board.checkWin())
			System.out.println("Round draw ");
	}

}
