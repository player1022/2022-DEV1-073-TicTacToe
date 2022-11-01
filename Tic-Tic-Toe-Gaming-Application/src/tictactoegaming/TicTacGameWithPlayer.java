package tictactoegaming;

import java.util.Scanner;

public class TicTacGameWithPlayer {

	public static void playGameWithPlayer() {

		System.out.println("You will play with another User");
		
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		Scanner scanner = new Scanner(System.in);

		char[][] tictac = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		System.out.println("This is how the grid looks like:");
		GameHelper.printGrid(tictac);

		while (true) {
			player1Turn(tictac, scanner,name);
			if (isGameFinished(tictac,name)) {
				break;
			}
			GameHelper.printGrid(tictac);

			player2Turn(tictac, scanner);
			if (isGameFinished(tictac,name)) {
				break;
			}
			GameHelper.printGrid(tictac);
		}
		sc.close();
		scanner.close();
	}

	private static void player1Turn(char[][] board, Scanner scanner,String name) {
		String userInput;
		while (true) {
			System.out.println("Where would you like to play? (1-9)" +" "+name);
			userInput = scanner.nextLine();
			if (GameHelper.isValidPosition(board, userInput)) {
				break;
			} else {
				System.out.println(userInput + " is not a valid move.");
			}
		}
		GameHelper.placeSymbol(board, userInput, 'X');
	}

	private static void player2Turn(char[][] tictac, Scanner scanner) {

		String userInput;
		while (true) {
			System.out.println("Where would you like to play player2? (1-9)");
			userInput = scanner.nextLine();
			System.out.println("Player2 chose " + userInput);
			if (GameHelper.isValidPosition(tictac, userInput)) {
				break;
			}
			else 
			{
				System.out.println(userInput + " is not a valid move.");
			}
		}
		GameHelper.placeSymbol(tictac, userInput, 'O');
	}
	
	public static boolean isGameFinished(char[][] tictac, String name) {

		if (GameHelper.whoWon(tictac, 'X')) {
			GameHelper.printGrid(tictac);
			System.out.println(name+" "+"You win!");
			return true;
		}

		if (GameHelper.whoWon(tictac, 'O')) {
			GameHelper.printGrid(tictac);
			System.out.println("Player2 wins!");
			return true;
		}

		for (int i = 0; i < tictac.length; i++) {
			for (int j = 0; j < tictac[i].length; j++) {
				if (tictac[i][j] == ' ') {
					return false;
				}
			}
		}
		GameHelper.printGrid(tictac);
		System.out.println("The game ended in a tie!");
		return true;
	}

}
