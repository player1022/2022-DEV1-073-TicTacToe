package com.gaming.tictactoe.service.implementation;

import java.util.Scanner;
import com.gaming.tictactoe.utility.GamingUtilityHelper;

public class TicTacToeGameWithPlayer {

	public void playGameWithPlayer() {

		System.out.println("You will play with another player");
		
		System.out.println("Enter your name player1");
		Scanner sc = new Scanner(System.in);
		String player1Name = sc.nextLine();
		
		System.out.println("Enter your name player2");
		Scanner sc1 = new Scanner(System.in);
		String player2Name = sc1.nextLine();

		Scanner scanner = new Scanner(System.in);

		char[][] tictac = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		
		while (true) {
			player1Turn(tictac, scanner,player1Name);
			if (isGameFinished(tictac,player1Name,player2Name)) {
				break;
			}
			GamingUtilityHelper.printGrid(tictac);

			player2Turn(tictac, scanner,player2Name);
			if (isGameFinished(tictac,player1Name,player2Name)) {
				break;
			}
			GamingUtilityHelper.printGrid(tictac);
		}
		sc.close();
		sc1.close();
		scanner.close();
	}

	private void player1Turn(char[][] board, Scanner scanner,String player1Name) {
		String userInput;
		while (true) {
			System.out.println("Where would you like to play" +" "+player1Name+"(1-9)?");
			userInput = scanner.nextLine();
			if (GamingUtilityHelper.isValidPosition(board, userInput)) {
				break;
			} else {
				System.out.println(userInput + " is not a valid move.");
			}
		}
		GamingUtilityHelper.placeSymbol(board, userInput, 'X');
	}

	private void player2Turn(char[][] tictac, Scanner scanner,String player2Name) {

		String userInput;
		while (true) {
			System.out.println("Where would you like to play"+" "+player2Name +"(1-9)?");
			userInput = scanner.nextLine();
			System.out.println(player2Name+" "+"chose " + userInput);
			if (GamingUtilityHelper.isValidPosition(tictac, userInput)) {
				break;
			}
			else 
			{
				System.out.println(userInput + " is not a valid move.");
			}
		}
		GamingUtilityHelper.placeSymbol(tictac, userInput, 'O');
	}
	
	private boolean isGameFinished(char[][] tictac,String player1Name,String player2Name) {

		if (GamingUtilityHelper.whoWon(tictac, 'X')) {
			GamingUtilityHelper.printGrid(tictac);
			System.out.println(player1Name+" "+"you win!");
			return true;
		}

		if (GamingUtilityHelper.whoWon(tictac, 'O')) {
			GamingUtilityHelper.printGrid(tictac);
			System.out.println(player2Name+" "+"Player2 wins!");
			return true;
		}

		for (int i = 0; i < tictac.length; i++) {
			for (int j = 0; j < tictac[i].length; j++) {
				if (tictac[i][j] == ' ') {
					return false;
				}
			}
		}
		GamingUtilityHelper.printGrid(tictac);
		System.out.println("The game ended in a tie!");
		return true;
	}

}
