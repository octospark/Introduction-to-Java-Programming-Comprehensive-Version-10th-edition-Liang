package chapter7;

import java.util.Scanner;

/**
 * @author pc
 *
 * Dec 27, 2017
 * (Find the index of the smallest element) Write a method that returns the index of
 *	the smallest element in an array of integers. If the number of such elements is
 *	greater than 1, return the smallest index.
 */
public class Exercise7_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten values: ");
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextDouble();
		System.out.println("The index of the minimum is " + indexOfSmallestElement(array));
		input.close();
	}
	public static int indexOfSmallestElement(double[] array) {
		int minIndex = 0;
		double min = array[minIndex];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				minIndex = i;
				min = array[i];
			}
		}
		return minIndex;
	}
}
