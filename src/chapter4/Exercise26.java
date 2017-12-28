package chapter4;

import java.util.Scanner;

public class Exercise26 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = input.nextLine();
		int indexOfPoint = amount.indexOf('.');
		String dollars = amount.substring(0, indexOfPoint);
		String cents = amount.substring(indexOfPoint + 1);
		
		
		// Find the number of one dollars
		int numberOfOneDollars = Integer.parseInt(dollars);
		int remainingAmount = Integer.parseInt(cents);
		
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
