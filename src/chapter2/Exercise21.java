package chapter2;
import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask user for investment amount, annual interest rate and number of years
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter annual ineterest rate: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter the umber of years for investment: ");
		double years = input.nextDouble();
		
		// Calculate future investment value
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
		double formatedFutureValue = (int)(futureInvestmentValue *100) / 100.0;
		// Display results
		System.out.println("The accumulated value is %" + formatedFutureValue);
		input.close();
	}
}
