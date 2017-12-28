package chapter2;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double KILO_PER_POUND = 0.454;
		
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilos = KILO_PER_POUND * pounds;
		
		System.out.println(pounds + " pounds " + " is " + kilos + " kilos.");
		input.close();
	}
}
