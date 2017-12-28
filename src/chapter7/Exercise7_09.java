package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 26, 2017
 */
public class Exercise7_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten values: ");
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
		System.out.println("The minimum is " + min(array));
		input.close();
	}
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}
}
