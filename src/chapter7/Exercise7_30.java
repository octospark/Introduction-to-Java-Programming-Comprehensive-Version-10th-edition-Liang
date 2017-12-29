package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 29, 2017
 * 
 * (Pattern recognition: consecutive four equal numbers) Write a method
 *  that tests whether the array has four consecutive numbers with the same
 * value.
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series.
 */
public class Exercise7_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		
		int[] array = new int[size];
		System.out.print("Enter " + size + " elements of the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		if (isConsecutiveFour(array))
			System.out.println("The list has at least four equal consecutive numbers");
		else
			System.out.println("No consecutive four found.");
		
		input.close();
	}
	
	/** Return true if at least four consecutive elements in an array are equal*/
	public static boolean isConsecutiveFour(int[] values) {
		int countFour = 1;
		int start = values[0];
		for (int i = 1; i < values.length; i++) {
			if (start == values[i])
				countFour++;
			else {
				start = values[i];
				countFour = 1;
				}
			
			
			if (countFour >= 4)
				return true;
		}
		return false;
	}
}
