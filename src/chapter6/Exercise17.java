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
public class Exercise17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int digit = (int)(Math.random() * 2);
				System.out.print(digit + " ");
			}
			System.out.println();
		}
	}
}
