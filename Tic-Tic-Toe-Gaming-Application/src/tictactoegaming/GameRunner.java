package tictactoegaming;

import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {

		System.out.println("Welcome to Tic Tac Toe");
		gameRules();
		System.out.println("Choose who you want to play with? computer or player");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		if (!choice.isEmpty() && choice.trim().length() > 0 && choice.equalsIgnoreCase("computer")) {
			TicTacGameWithComputer.playGameWithComputer();
		} 
		else if (!choice.isEmpty() && choice.trim().length() > 0 && choice.equalsIgnoreCase("player")) {
			TicTacGameWithPlayer.playGameWithPlayer();
		}
		else {
			System.out.println("Not a valid name, Please try again with Computer or Player");
			System.exit(0);
		}
		sc.close();
	}
	//defining the rules of the game
	private static void gameRules() {

		System.out.println("Only two players are allowed in the game");
		System.out.println("You can choose to either play against the computer or another player");
		System.out.println("Only two symbols will be there in the game X and O");
		System.out.println("The first player will always be assigned X");
		
		char[][] tictac = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		System.out.println("This is how the grid looks like:");
		GameHelper.displayGrid(tictac);
		System.out.println("You have to enter a number between 1 to 9 in order to place your symbol in the grid");
	}
}