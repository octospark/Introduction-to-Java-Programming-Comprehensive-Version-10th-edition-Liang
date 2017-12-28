package chapter5;
import java.util.Scanner;
public class Exercise30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the number of months: ");
		int months = input.nextInt();
		
		System.out.print("Enter annual interest: ");
		double annualInterest = input.nextDouble();
		
		double monthlyInterest = annualInterest / 1200;
		
		double sum = 0;
		for (int month = 1; month <= months; month++) {
			sum += Math.pow((1 + monthlyInterest), month) * amount;
		}
		System.out.printf("After %d months the value of the investment is $%7.3f\n",months, sum);
		input.close();
	}
}
