package chapter10;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 28, 2018 3:22:26 PM
 * (Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order.
 */
public class Exercise10_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		StackOfIntegers stack = new StackOfIntegers();
		
		int start = 2;
		while (number != 1) {
			while(number % start == 0) {
				stack.push(start);
				number /= start;
			}
			start += 1;
		}
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
		
		input.close();
	}
}
