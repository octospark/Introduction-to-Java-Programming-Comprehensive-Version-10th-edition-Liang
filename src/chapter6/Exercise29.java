/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;
import chapter6.PrimeNumberMethod;
/**
 * @author pc
 *
 */
public class Exercise29 {
	public static void main(String[] args) {
		int number = 2;
		while (number < 1000) {
			if(PrimeNumberMethod.isPrime(number) && PrimeNumberMethod.isPrime(number + 2)) {
				System.out.println("(" + number + ", " + (number + 2) + ")");
			}
			number++;
		}
	}
}
