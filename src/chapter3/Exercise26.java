package chapter3;
import java.util.Scanner;

public class Exercise26 {
	public static void main(String[] args) {
		// Create scanner and get the number from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		// Determine the divisibility by 5 and 6 and print the results
		boolean and = false;
		boolean or = false;
		boolean both = false;
		
		if (integer % 5 == 0 || integer % 6 == 0)
			or = true;
		if (integer % 5 == 0 && integer % 6 == 0)
			and = true;
		if (integer % 5 == 0 ^ integer % 6 == 0)
			both = true;
		
		System.out.println("Is " + integer + " divisible by 5 and 6? " + and);
		System.out.println("Is " + integer + " divisible by 5 or 6? " + or);
		System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + both);
		
		input.close();
	}
}
