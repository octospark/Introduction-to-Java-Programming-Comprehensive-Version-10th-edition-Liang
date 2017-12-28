package chapter2;
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * 3.1415926;
		
		// Display results
		System.out.println("The area for the circle of radius " + 
		radius + " is " + area);
		
		input.close();
	}
}
