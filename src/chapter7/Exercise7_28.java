package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 28, 2017
 */
public class Exercise7_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++)
				System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
		}
		input.close();
	}
}
