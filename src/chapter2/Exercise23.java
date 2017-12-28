package chapter2;
import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the driving distance, fuel efficiency and price per gallon
		System.out.print("Enter the driving distance: ");
		double distanceInMiles = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Calculate cost of trip
		double totalCost = (int)((distanceInMiles / milesPerGallon) * pricePerGallon * 100) / 100.0;
		
		// Display Results
		System.out.println("The cost of driving is $" + totalCost);
		input.close();
	}
}
