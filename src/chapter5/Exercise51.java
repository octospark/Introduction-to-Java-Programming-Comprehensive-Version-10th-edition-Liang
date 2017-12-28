/*
 * (Longest common prefix) Write a program that prompts the user to enter two
*  strings and displays the largest common prefix of the two strings.
*  Made by Erlin Goce at 12/18/2017
 */
package chapter5;
import java.util.Scanner;
public class Exercise51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1. Get the strings
		System.out.print("Enter the first string: ");
		String first = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		//2. find the length of the shortest string for the loop
		int length1 = first.length();
		int length2 = second.length();
		int shortest = Math.min(length1, length2);
		
		//3. make a loop to find the longest prefix in common
		String prefix = "";
		for (int i = 0; i < shortest; i++) {
			if (first.charAt(i) != second.charAt(i))
				break;
			else
				prefix += first.charAt(i);
		}
		if (prefix.length() == 0) {
			System.out.println(first + " and " + second + " have no common prefix");
		}
		else {
			System.out.println("The common prefix is " + prefix);
		}
		input.close();
	}
}
