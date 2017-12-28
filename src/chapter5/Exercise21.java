package chapter5;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter loan amount
		System.out.print("Enter a loan amount: ");
		double loanAmount = input.nextDouble();
		
		// Enter number of years
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
				
				
		
		double annualInterestRate = 5;//start with 5 %
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
				
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1
				- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.println("Interest    Monthly Payment    Total Payment");		
		for (int i = 5000; i <= 8000; i+= 125) {
			System.out.printf("%-5.3f%%",  (i / 1000.0));
			System.out.printf("%12.2f%21.2f\n", monthlyPayment, totalPayment);
			monthlyInterestRate += (0.125 / 1200);
			monthlyPayment = loanAmount * monthlyInterestRate / (1
					- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			totalPayment = monthlyPayment * numberOfYears * 12;
		}
		
		input.close();
	}
}
