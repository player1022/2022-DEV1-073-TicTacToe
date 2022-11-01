package tictactoegaming;

import java.util.Scanner;

public class GamingConsole {

	public static void main(String[] args) {

		System.out.println("Welcome to the Tic Tac Toe game");
		gameRules();
		System.out.println("choose who you want to play with? computer or user");
		Scanner sc= new Scanner(System.in);
		String choice = sc.nextLine();
		
		if(!choice.isEmpty() && choice.trim().length()>0 && choice.equals("computer"))
			{
				TicTacGameWithComputer.playGameWithComputer();
			}
		else
			{
				TicTacGameWithPlayer.playGameWithPlayer();
			}
			sc.close();
	}

	private static void gameRules() {

		System.out.println("Only two players are allowed in the game");
		System.out.println("You can choose to either play against the computer or another user");
		System.out.println("Only two symbols will be there in the game X and O");
		System.out.println("The first player will always get X");

	}
}