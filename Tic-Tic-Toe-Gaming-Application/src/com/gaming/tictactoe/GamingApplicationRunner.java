package com.gaming.tictactoe;

import java.util.Scanner;
import com.gaming.tictactoe.service.GamingService;
import com.gaming.tictactoe.utility.GamingUtilityHelper;

public class GamingApplicationRunner {

	public static void main(String[] args) {
		
		//displaying the rules of the game
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println("Only two players are allowed in the game");
		System.out.println("You can choose to either play against the computer or another player");
		System.out.println("Only two symbols will be there in the game X and O");
		System.out.println("The first player is always assigned X");
		
		char[][] tictac = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		System.out.println("This is how the grid looks like:");
		GamingUtilityHelper.printGrid(tictac);
		System.out.println("You have to enter a number between 1 to 9 in order to place your symbol in the grid");
		
		GamingService service = new GamingService(); //to call the service
		
		System.out.println("Choose who you want to play with? computer or player");
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.nextLine();
		service.validate(choice);
		
		sc.close();
	}
}
