package chapter3;
import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		// Prompt the user to enter the conversion rate
		// and the way the conversion happens
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int direction = input.nextInt();
		
		if (direction == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollars = input.nextDouble();
			double RMB = dollars * rate;
			
			System.out.println("$" + dollars + " is " + RMB + " yuan");
		}
		else if (direction == 1) {
			System.out.print("Enter the RMB amount: ");
			double RMB = input.nextDouble();
			double dollars =((int) (RMB / rate * 100) / 100.0) ;
			
			System.out.println(RMB + " yuan is $" + dollars);
		}
		else {
			System.out.println("Incorrect input");
			System.exit(1);
		}
		input.close();
	}
}
