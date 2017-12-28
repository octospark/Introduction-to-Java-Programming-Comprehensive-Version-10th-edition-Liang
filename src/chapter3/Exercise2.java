package chapter3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		if (answer == number1 + number2 + number3) {
			System.out.println("You are right!");
		}
		else {
			System.out.println("Your answer is incorrect.");
			System.out.println(number1 + " + " + number2 + " + " +
					number3 + " = " + (number1 + number2 + number3));
		}
			
		input.close();
	}
}
