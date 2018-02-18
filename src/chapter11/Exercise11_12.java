package chapter11;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 6:28:35 PM
 * 
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 * 
 */
public class Exercise11_12 {
	public static void main(String[] args) {
		Double[] array = {1.2, 4.7, 8.5, 6.9, 3.4};
		ArrayList<Double> list = new ArrayList<>(Arrays.asList(array));
		System.out.println(sum(list));
	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		return sum;
	}
}
