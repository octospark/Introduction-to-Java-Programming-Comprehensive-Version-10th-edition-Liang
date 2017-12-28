package chapter7;

import java.util.Scanner;

/**
 * @author pc
 *
 * Dec 27, 2017
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 * The selection-sort method repeatedly finds the smallest number in the current
 * array and swaps it with the first. Rewrite this program by finding the largest number
 * and swapping it with the last. Write a test program that reads in ten double
 * numbers, invokes the method, and displays the sorted numbers.
 */
public class Exercise7_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		selectionSort(numbers);
		Exercise7_15.printArray(numbers);
		input.close();
	}
	public static void selectionSort(double[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j > -1; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
