package chapter2;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount as number of cents, for example 1156 cents: ");
		int amount = input.nextInt();
		
		int remainingAmount = amount;
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		// Find the number of nickels remaining in the amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");
		
		input.close();		
	}
}
