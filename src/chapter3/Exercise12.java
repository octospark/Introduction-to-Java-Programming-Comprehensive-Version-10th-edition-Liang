package chapter3;
import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		// Create a scanner object and obtain the number from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		int original = number;
		// Separate the first and the last digit and compare them
		// to determine palindromic property
		int last = number % 10;
		number /= 10;
		int first = number / 10;
		
		if (first == last)
			System.out.println(original + " is a palindrome");
		else
			System.out.println(original + " is not a palindrome");
		
		input.close();
	}
}
