package chapter5;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter loan amount
		System.out.print("Enter a loan amount: ");
		double loanAmount = input.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		// Enter annual interest in percentage, e.g., 7.25%
		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.printf("Monthly payment is $%-5.2f\n", monthlyPayment);
		System.out.printf("Total payment is $%-9.2f\n", totalPayment);
		System.out.println("Payment#   Interest   Principal   Balance");
		for (int k = 1; k <= numberOfYears * 12; k++) {
			double interest = monthlyInterestRate * loanAmount;
			double principal = monthlyPayment - interest;
			loanAmount -= principal;
			System.out.printf("%-5d%11.2f%12.2f%13.2f\n", k, interest, principal, loanAmount);
		}
		input.close();
	}
}
