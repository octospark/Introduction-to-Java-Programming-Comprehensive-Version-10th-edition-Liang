/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println("Years    Future Value");
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%-3d%15.2f\n", i, futureInvestmentValue(amount, monthlyInterestRate, i));
		}
		input.close();
	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,
			int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
