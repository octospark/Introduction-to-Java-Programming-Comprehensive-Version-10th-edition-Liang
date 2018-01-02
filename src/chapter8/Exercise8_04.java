package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 1, 2018 7:04:20 PM
 */
public class Exercise8_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int numEmployees = input.nextInt();
		System.out.println("Enter the employee's hours worked per day, row by row: ");
		
		int[][] hoursWorked = new int[numEmployees][7];
		for (int i = 0; i < hoursWorked.length; i++)
			for (int j = 0; j < hoursWorked[i].length; j++) {
				hoursWorked[i][j] = input.nextInt();
			}
		int[][] sumOfHoursWorked = new int[numEmployees][2];
		for (int i = 0; i < hoursWorked.length; i++)
			for (int j = 0; j < hoursWorked[i].length; j++) {
				sumOfHoursWorked[i][1] += hoursWorked[i][j];
				sumOfHoursWorked[i][0] = i;
			}
		bubbleSort(sumOfHoursWorked);
		printArray(sumOfHoursWorked);
		input.close();
	}
	public static void bubbleSort(int[][] array) {
		// array is a two dimensional array with the first index the employee
		// and the second the sum of the hours worked per week
		boolean swapSentinel = true;
		
		while (swapSentinel) {
			int countSwaps = 0;
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < i + 1; j++) {
					if (array[j][1] > array[i][1]) {
						countSwaps++;
						int tempValue = array[j][1];
						int tempIndex = array[j][0];
						array[j][1] = array[i][1];
						array[j][0] = array[i][0];
						array[i][1] = tempValue;
						array[i][0] = tempIndex;
					}
				}
			}
			// Continuing condition
			if (countSwaps != 0)
				swapSentinel = true;
			else
				swapSentinel = false;
		}
	}
	/** print a custom tuple of two values for a two dimensional array
	 * for the employee class */
	public static void printArray(int[][] array) {
		for (int i = 0; i <array.length; i++)
			System.out.println("Employee " + array[i][0] + " worked a total of " +
		array[i][1] + " hours");
	}
}
