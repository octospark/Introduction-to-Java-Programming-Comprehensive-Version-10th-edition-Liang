package chapter7;

import java.util.Scanner;

/**
 * @author pc
 *
 * Dec 27, 2017
 * Write a method that returns a new array by eliminating the
 * duplicate values in the array
 */
public class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			
		}
		int[] k =  eliminateDuplicates(numbers);
		System.out.print("The distinct numbers are: ");
		k = cleanZeros(k);
		printArray(k);
		input.close();
	}
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinct = new int[list.length];
		int count = 0 ;
		for (int i = 0; i < list.length; i++) {
			if (!Exercise7_13.inArray(list[i], distinct)) {
				distinct[count] = list[i];
				count++;
			}
		}
		return distinct;
	}
	/** Print an array */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	public static void printArray(double[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	public static void printArray(boolean[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	/** Clean the zero values from array and return the ew array */
	public static int[] cleanZeros(int[] array) {
		int countZeros = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				countZeros++;
		}
		int[] cleanFromZeros = new int[array.length - countZeros];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				cleanFromZeros[count] = array[i];
				count++;
			}
		}
		return cleanFromZeros;
	}
}
