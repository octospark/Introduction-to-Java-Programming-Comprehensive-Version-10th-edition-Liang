package chapter3;
import java.util.Scanner;
public class Exercise33 {
	public static void main(String[] args) {
		// Get the weight and prices of the packages of rice
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		// calculate the price per unit for both packages and display the cheapest one
		double pricePerUnit1 = price1 / weight1;
		double pricePerUnit2 = price2 / weight2;
		
		if (pricePerUnit1 > pricePerUnit2)
			System.out.println("Package 2 has a better price");
		else if (pricePerUnit1 == pricePerUnit2)
			System.out.println("Two packages have the same price");
		else
			System.out.println("Package 1 has a better price");
		
		input.close();
	}
}
