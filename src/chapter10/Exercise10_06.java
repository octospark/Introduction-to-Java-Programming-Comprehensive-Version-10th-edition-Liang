package chapter10;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 28, 2018 3:33:08 PM
 * 
 * (Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order.
 */
public class Exercise10_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 2; i <= number; i++) {
			if (isPrime(i))
				stack.push(i);
		}
		
		int count = 1;
		System.out.println("The prime numbers less than " + number + " are: ");
		while (!stack.empty()) {
			System.out.print(stack.pop() + ", ");
			count++;
			if (count % 10 == 0)
				System.out.println();
			}
		input.close();
	}
	public static boolean isPrime(int value) {
		int start  = 2;
		for (int i = start; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
}
