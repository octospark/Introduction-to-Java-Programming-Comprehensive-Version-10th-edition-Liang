package chapter3;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)Math.round(amount * 100);
		
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
		if (numberOfOneDollars == 1)
			System.out.println("    " + numberOfOneDollars + " dollar");
		else
			System.out.println("    " + numberOfOneDollars + " dollars");
		
		if (numberOfQuarters == 1)
			System.out.println("    " + numberOfQuarters + " quarter");
		else
			System.out.println("    " + numberOfQuarters + " quarters");
		
		if (numberOfDimes == 1)
			System.out.println("    " + numberOfDimes + " dime");
		else
			System.out.println("    " + numberOfDimes + " dimes");
		
		if (numberOfNickels == 1)
			System.out.println("    " + numberOfNickels + " nickel");
		else
			System.out.println("    " + numberOfNickels + " nickels");
		
		if (numberOfPennies == 1)
			System.out.println("    " + numberOfPennies + " penny");
		else
			System.out.println("    " + numberOfPennies + " pennies");
		
		input.close();
	}
}
