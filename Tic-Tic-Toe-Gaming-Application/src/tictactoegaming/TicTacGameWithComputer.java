package tictactoegaming;

import java.util.Random;
import java.util.Scanner;

public class TicTacGameWithComputer {

	public static void playGameWithComputer() {

		System.out.println("You will play with the Computer");
		
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		Scanner scanner = new Scanner(System.in);

		char[][] tictac = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		/*System.out.println("This is how the grid looks like:");
		GameHelper.printGrid(tictac);*/

		while (true) {
			player1Turn(tictac, scanner, name);
			if (isGameFinished(tictac, name)) {
				break;
			}
			GameHelper.printGrid(tictac);

			computerTurn(tictac);
			if (isGameFinished(tictac, name)) {
				break;
			}
			GameHelper.printGrid(tictac);
		}
		scanner.close();
		sc.close();
	}

	private static void player1Turn(char[][] tictac, Scanner scanner, String name) {

		String userInput;
		while (true) {

			System.out.println("Where would you like to play? (1-9)" + " " + name);
			userInput = scanner.nextLine();
			if (GameHelper.isValidPosition(tictac, userInput)) {
				break;
			} else {
				System.out.println(userInput + " is not a valid move.");
			}
		}
		GameHelper.placeSymbol(tictac, userInput, 'X');
	}

	private static void computerTurn(char[][] tictac) {
		Random rand = new Random();
		int computerMove;
		while (true) {
			computerMove = rand.nextInt(9) + 1;
			if (GameHelper.isValidPosition(tictac, Integer.toString(computerMove))) {
				break;
			}
		}
		System.out.println("Computer chose " + computerMove);
		GameHelper.placeSymbol(tictac, Integer.toString(computerMove), 'O');
	}

	public static boolean isGameFinished(char[][] tictac, String name) {

		if (GameHelper.whoWon(tictac, 'X')) {
			GameHelper.printGrid(tictac);
			System.out.println(name + " " + "you win!");
			return true;
		}

		if (GameHelper.whoWon(tictac, 'O')) {
			GameHelper.printGrid(tictac);
			System.out.println("Computer wins!");
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
