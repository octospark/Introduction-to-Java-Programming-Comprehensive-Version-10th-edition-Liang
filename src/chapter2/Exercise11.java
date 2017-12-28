package chapter2;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double startingPopulation = 312032486;
		double changePerYear = (365 * 24 * 3600 * (1.0/7 - 1.0/13 + 1.0/45));
		
		int totalChange = (int)(startingPopulation + years * changePerYear);
		System.out.println("The population after " + years + " years is " + 
		totalChange);
		input.close();
	}
}
