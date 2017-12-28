/*
 * The program calculates the sales needed to attain a certain amount
 * of commissions determined by the user.
 */
package chapter5;
import java.util.Scanner;
public class Exercise42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the comission sought for the year: ");
		double comissionSought = input.nextDouble();
		
		double comissions = 0;
		int sales = 0;
		for (sales = 0; comissions <= comissionSought; sales++) {
			if (sales < 5000) {
				comissions += 0.08;
			}
			else if(sales < 10000) {
				comissions += 0.1;
			}
			else {
				comissions += 0.12;
			}
			sales++;
		}
		System.out.printf("The amount of yearly sales for a $30000 year pay will be $%,d", sales);
		input.close();
	}
}
