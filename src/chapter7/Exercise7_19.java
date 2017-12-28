package chapter7;

import java.util.Scanner;

/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		boolean sorted = isSorted(numbers);
		if (sorted)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		input.close();
	}
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++)
			if (list[i] > list[i + 1])
				return false;
		return true;
	}
}
