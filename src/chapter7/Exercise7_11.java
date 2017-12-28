package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
		input.close();
	}
	public static double deviation(double[] array) {
		double mean = mean(array);
		double sumOfDifferencesSquared = 0;
		for (int i = 0; i < array.length; i++)
			sumOfDifferencesSquared += Math.pow((array[i] - mean), 2);
		return Math.sqrt(sumOfDifferencesSquared / (array.length - 1));
	}
	public static double mean(double[] array) {
		double sum = 0;
		for (double k: array)
			sum += k;
		return sum / array.length;
	}
}
