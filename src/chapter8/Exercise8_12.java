package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 2, 2018 6:18:22 PM
 * (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
 * using arrays. For each filing status, there are six tax rates. Each rate is applied
 * to a certain amount of taxable income.
 */
public class Exercise8_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or " +
		"qualifying widow(er), 2-married separately, 3-head of \n" + 
				"household) Enter the filing status: ");
		int status = input.nextInt();
		
		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		int income = input.nextInt();
		
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
				{0, 8350, 33950, 82250, 171550, 372950},  // Single filer
				{0, 16700, 67900, 137050, 20885, 372950}, // Married jointly
													   // -or qualifying widow(er)
				{0, 8350, 33950, 68525, 104425, 186475},  // Married separately
				{0, 11950, 45500, 117450, 190200, 372950} // Head of household
				};
		System.out.print("The tax is " + computeTax(brackets, rates, status, income));
		input.close();
	}
	public static double computeTax(int[][] brackets, double[] rates,
			int status, int income) {
		int[] bracket = brackets[status];
		double tax = 0;
		// Find the index where the income falls in the brackets list
		int index = 0;
		while (income > bracket[index])
			index++;
		
		int start = 0;
		while (start < index - 1) {
			tax += (bracket[start + 1] - bracket[start]) * rates[start];
			start++;
		}
		tax += (income - bracket[start]) * rates[start];
		return tax;
	}
}
