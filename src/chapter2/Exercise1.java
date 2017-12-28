package chapter2;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter a degree in Celsius
		System.out.print("Enter temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		// Compute the temperature in fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		// Display result
		System.out.println(celsius + " Celsius is "
		 + fahrenheit + " Fahrenheit");
		
		input.close();
	}
}
