package chapter12;
import java.util.*;
/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 7:07:13 PM
 * 
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
 * requirements:
 *  - Creates an array with 100 randomly chosen integers.
 *  - Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the
 * message Out of Bounds.
 */
public class Exercise12_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[100];
		for (int i = 0; i < list.length; i++)
			list[i] = (int)(Math.random() * 500);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		try {
			int element = list[index];
			System.out.println("The element of the list is " + element);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
		input.close();
	}
}
