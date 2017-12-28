/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;
import java.util.Scanner;
/**
 * @author pc
 *
 */
public class Exercise22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		System.out.println(sqrt(number));
		input.close();
	}
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + (n * 1.0)/ lastGuess);
		double difference = Math.abs(lastGuess - nextGuess);
		while (difference > 0.000001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (n * 1.0)/ lastGuess) / 2;
			difference = Math.abs(lastGuess - nextGuess);
		}
		return nextGuess;
	}
}
