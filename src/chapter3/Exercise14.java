package chapter3;
import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		// Create a scanner and obtain the guess for heads
		// or tails from the user in the form of a 0 or 1
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your guess for the coin (0-heads, 1-tails): ");
		int guess = input.nextInt();
		
		// Generate a random number representing the flip 
		// of the coin
		int random = (int)(Math.random() * 2);
		
		if (guess == random)
			System.out.println("You guessed correctly");
		else
			System.out.println("Your guess was incorrect");
		input.close();
		
	}
}
