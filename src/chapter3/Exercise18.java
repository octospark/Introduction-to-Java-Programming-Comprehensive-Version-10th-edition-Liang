package chapter3;
import java.util.Scanner;

public class Exercise18 {
	public static void main(String[] args) {
		// Create a Scanner to obtain the weight of the package 
		// from the user and then calculate the cost of shipping
		// based on several conditions of the weight
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package in pounds: ");
		double weight = input.nextDouble();
		
		// the cost variable will be changed according to the weight of the package
		double cost = 0;
		if (weight < 0) {
			System.out.println("Weight cannot be negative.");
			System.exit(1);
		}
		if (weight > 0 && weight <= 1)
			cost = 3.5;
		else if (weight <= 3)
			cost = 5.5;
		else if (weight <= 10)
			cost = 8.5;
		else if (weight <= 20)
			cost = 10.5;
		else if (weight <= 50)
			cost = 12.5;
		
		if (cost == 0)
			System.out.println("Cannot ship package with weight greater than 50 pounds");
		else 
			System.out.println("It would cost you &" + cost + " to ship your package with weight " +
		weight + " pounds");
		
		input.close();
	}
}
