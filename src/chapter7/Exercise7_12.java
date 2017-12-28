package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter nine numbers: ");
		double[] numbers = new double[9];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		reverse(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		input.close();
	}
	public static void reverse(double[] array) {
		for (int i = 0; i < (array.length / 2); i++) {
			double temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
}
