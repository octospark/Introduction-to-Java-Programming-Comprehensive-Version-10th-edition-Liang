package chapter3;
import java.util.Scanner;
public class Exercise17 {
	public static void main(String[] args) {
		// A game that plays Rock, Paper Scissor
		// Create a Scanner and take input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoice = input.nextInt();
		
		// Generate the choice of the computer
		int cpuChoice = (int)(Math.random() * 3);
		
		// Compare choices and determine the result of the game
		
		if (cpuChoice == 0) {
			if (userChoice == 0)
				System.out.println("The computer is scissor. You are scissor. It is a draw");
			else if (userChoice == 1)
				System.out.println("The computer is scissor. You are rock. You won");
			else
				System.out.println("The computer is scissor. You are paper. You lost");
		}
		else if (cpuChoice == 1) {
			if (userChoice == 0)
				System.out.println("The computer is rock. You are scissor. You lost");
			else if (userChoice == 1)
				System.out.println("The computer is rock. You are rock. It is a draw");
			else
				System.out.println("The computer is rock. You are paper. You won");
		}
		else {
			if (userChoice == 0)
				System.out.println("The computer is paper. You are scissor. You won");
			else if (userChoice == 1)
				System.out.println("The computer is paper. You are rock. You lost");
			else
				System.out.println("The computer is paper. You are paper. It is a draw");
		}
		input.close();
	}
}
