package com.Aurionpro.Test;
import java.util.Random;
import java.util.Scanner;

import com.Aurionpro.Model.*;

import com.Aurionpro.Model.RefactorPigDice;

public class RefactorPigDiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
	    RefactorPigDice2 game = new RefactorPigDice2();
	    game.playGame(scanner ,random);
	}
		
}

