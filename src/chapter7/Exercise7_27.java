package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 28, 2017
 * (Identical arrays) The arrays list1 and list2 are identical if they have the
 * same contents. Write a method that returns true if list1 and list2 are identical.
 */
public class Exercise7_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list 1: ");
		// The length of the list is the first input from the scanner.
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int i = 0; i < length1; i++)
			list1[i] = input.nextInt();
		
		System.out.print("Enter list 2: ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		for (int i = 0; i < length2; i++)
			list2[i] = input.nextInt();
		
		if (equals(list1, list2))
			System.out.println("The lists are equal");
		else
			System.out.println("The list are not equal");
		
		input.close();
	}
	/** Return true if two arrays have the same contents*/
	public static boolean equals(int[] list1, int[] list2) {
		// Check if the lists have the same length
		if (list1.length != list2.length)
			return false;
		/* Check if every element from the first list is in the second and 
		 * that every element in the second list is in the first one.*/
		for (int i = 0; i < list1.length; i++) {
			if (!isInList(list1[i], list2))
				return false;
			if (!isInList(list2[i], list1))
				return false;
		}
		return true;
		
	}
	
	/** Return true if some element is in a given list */
	public static boolean isInList(int number, int[] list) {
		for (int i = 0; i < list.length; i++)
			if (list[i] == number)
				return true;
		return false;
	}
}
