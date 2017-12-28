package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 26, 2017
 */
public class Exercise7_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten values: ");
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
		System.out.println("The average is " + average(array));
		input.close();
	}
	public static int average(int[] array) {
		int sum = 0;
		for (int k: array)
			sum += k;
		return sum / array.length;
	}
	public static double average(double[] array) {
		double sum = 0;
		for (double k: array) {
			sum += k;
		}
		return sum / array.length;
	}
}
