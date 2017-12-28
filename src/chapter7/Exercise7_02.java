package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 25, 2017
 */
public class Exercise7_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		int[] numbers = new int[10];
		for (int i = numbers.length - 1; i >= 0; i--) {
			numbers[i] = input.nextInt();
		}
		for (int number: numbers)
			System.out.print(number + " ");
		input.close();
	}
}
