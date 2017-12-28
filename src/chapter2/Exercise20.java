package chapter2;
import java.util.Scanner;
public class Exercise20 {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Ask the user for the balance and the annual interest rate
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		// Calculate interest
		double interest = balance * (annualInterestRate/  1200);
		
		// Display result
		System.out.println("The interest is " + interest);
		input.close();
	}
}
