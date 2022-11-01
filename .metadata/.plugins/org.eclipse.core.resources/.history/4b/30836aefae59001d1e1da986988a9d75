package tictactoegaming;

import java.util.Scanner;

public class GamingConsole {

	public static void main(String[] args) {
		System.out.println("Welcome to tic tac toe game");
		Scanner sc = new Scanner(System.in);
		
		playGame();
		char [][] tictac = new char[3][3];
		printGrid(tictac);
}
	
	private static void playGame()
	{
		System.out.println("Only two players are allowed in the game");
		System.out.println("You should enter your name as Player1 or Player2");
		System.out.println("Only two symbols are allowed in the game X and O");
		System.out.println("The first player will get X");
		System.out.println("Given below is the grid pattern of the game and it will be changed accordingly as you enter the values");
	}

	private static void printGrid(char[][] tictac)
		{
		System.out.println(tictac[0][0]+"|"+tictac[0][1]+"|"+tictac[0][2]);
		System.out.println("--"+"--"+"-");
		System.out.println(tictac[1][0]+"|"+tictac[1][1]+"|"+tictac[1][2]);
		System.out.println("--"+"--"+"-");
		System.out.println(tictac[2][0]+"|"+tictac[2][1]+"|"+tictac[2][2]);
		System.out.println("--"+"--"+"-");
	
		}
	
	private static void placeSymbol(char[][] tictac, String position, char symbol)
	{
		switch(position)
		{
		case"1":
			tictac[0][0]=symbol;
			break;
		case"2":
			tictac[0][1]=symbol;
			break;
		case"3":
			tictac[0][2]=symbol;
			break;
		case"4":
			tictac[1][0]=symbol;
			break;
		case"5":
			tictac[1][1]=symbol;
			break;
		case"6":
			tictac[1][2]=symbol;
			break;
		case"7":
			tictac[2][0]=symbol;
			break;
		case"8":
			tictac[2][1]=symbol;
			break;
		case"9":
			tictac[2][2]=symbol;
			break;		
		}
	}
	
	/*private static void player1Turn(char [][]tictac,int position,char symbol)
	{
		int position; // but this needs to be validated from main and then given to only be X
		while(true)
		{
			System.out.println("In which position would you like to insert your symbol?");
			if(isValidPosition())
			{
				break;
			}
			else 
			{
				System.out.println("this position has already been filled");
			}
		}
		placeSymbol(tictac,position,symbol);
	}*/
	
	private static void player2Turn()
	{
		
	}
	
	/*private static boolean isValidPosition(char [][] tictac, int position)
	{
		switch(position)
		{
		case 1:
			return(tictac[0][1]=='');
		case 2:
			return (tictac[0][1]=='');
		case 3:
			return (tictac[0][2]=='');
		case 4 :
			return (tictac[1][0]=='');
		case 5:
			return (tictac[1][1]=='');
		case 6:
			return (tictac[1][2]=='');
		case 7:
			return (tictac[0][0]=='');
		case 8:
			return (tictac[0][0]=='');
		case 9:
			return (tictac[0][0]=='');
		default:
			return false;
		}
	}*/
	
	private static boolean isGameFinished()
	{
		return false;
	}
	
	private static boolean whoWon()
	{
		return false;
	}
		
	}


