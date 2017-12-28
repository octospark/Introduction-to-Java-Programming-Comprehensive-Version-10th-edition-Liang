package chapter2;
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		// Constants of conversion
		final double KILOS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double kilos = KILOS_PER_POUND * pounds;
		double meters = METERS_PER_INCH * inches;
		
		// Calculate BMI
		double bmi = kilos / (meters * meters);
		
		System.out.println("BMI is " + bmi);
		input.close();
	}
}
