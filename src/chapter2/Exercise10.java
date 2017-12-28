package chapter2;
import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		/// Calculate energy needed to heat water to given temperature
		double energy = amount * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + energy);
		input.close();
	}
}
