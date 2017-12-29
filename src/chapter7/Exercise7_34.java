package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 29, 2017
 * (Sort characters in a string) Write a method that returns a sorted string
 */
public class Exercise7_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.next();
		String sorted = sort(string);
		System.out.println("The sorted string is " + sorted);
		
		input.close();
	}
	public static String sort(String s) {
		s = s.toLowerCase();// convert string to lowercase for consistency
		// Create and initialize two lists. List of characters and the corresponding ascii values
		char[] letters = new char[s.length()];
		int[] list = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			letters[i] = s.charAt(i);
			list[i] = Character.getNumericValue(s.charAt(i));
		}
		// Use selection sort on the list of char codes and do the necessary changes 
		// on the char list.
		for (int i = 0; i < list.length - 1; i++) {
			
			int currentMin = list[i];
			char currentMinChar = letters[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinChar = letters[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				letters[currentMinIndex] = letters[i];
				letters[i] = currentMinChar;
			}
		}
		String str = "";
		for (int i = 0; i < s.length(); i++)
			str += letters[i];
		return str;
	}
}
