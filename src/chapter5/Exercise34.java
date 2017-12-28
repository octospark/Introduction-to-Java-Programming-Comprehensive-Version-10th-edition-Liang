package chapter5;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		// A game that plays Rock, Paper Scissor until one of the players
		// wins two times more than the other in total
		// Create a Scanner and take input from the user
		Scanner input = new Scanner(System.in);
		int computerWins = 0;
		int guestWins = 0;
		while(Math.abs(computerWins - guestWins) <= 2) {
			System.out.print("scissor (0), rock (1), paper (2): ");
			int userChoice = input.nextInt();
			
			// Generate the choice of the computer
			int cpuChoice = (int)(Math.random() * 3);
			
			// Compare choices and determine the result of the game
			
			if (cpuChoice == 0) {
				if (userChoice == 0)
					System.out.println("The computer is scissor. You are scissor. This round is a draw");
				else if (userChoice == 1) {
					System.out.println("The computer is scissor. You are rock. You won the round");
					guestWins++;
					}
				else {
					System.out.println("The computer is scissor. You are paper. You lose this round");
					computerWins++;
					}
			}
			else if (cpuChoice == 1) {
				if (userChoice == 0) {
					System.out.println("The computer is rock. You are scissor. You lose this round");
					computerWins++;
					}
				else if (userChoice == 1)
					System.out.println("The computer is rock. You are rock. This round is a draw");
				else {
					System.out.println("The computer is rock. You are paper. You won the round");
					guestWins++;
					}
			}
			else {
				if (userChoice == 0) {
					System.out.println("The computer is paper. You are scissor. You won the round");
					guestWins++;
					}
				else if (userChoice == 1) {
					System.out.println("The computer is paper. You are rock. You lose the round");
					computerWins++;
					}
				else
					System.out.println("The computer is paper. You are paper. This round is a draw");
			}
		}
		if (computerWins > guestWins) {
			System.out.println("The computer wins the game");
		}
		else {
			System.out.println("You win the game");
		}
		input.close();
	}
}
