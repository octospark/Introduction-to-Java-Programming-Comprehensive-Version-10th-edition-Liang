package chapter12;

import java.io.File;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 2:28:47 PM
 * (Occurrences of each letter) Write a program that prompts the user to enter
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive.
 */
public class Exercise12_30 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/Lincoln.txt");
		Scanner output = new Scanner(file);
		int[] lettersCount = new int[26];
		while(output.hasNext()) {
			String line = output.nextLine();
			line = line.replaceAll("[,.:-]", "");
			line = line.toLowerCase();
			for (int i = 0; i < line.length(); i++) {
				if (Character.isLetter(line.charAt(i))) {
					lettersCount[(int)line.charAt(i) - 97]++;
				}
			}
		}
		for (int i = 0; i < lettersCount.length; i++) {
			System.out.println("Number of " + (char)(i + 65) + "'s " + lettersCount[i]);
		}
		output.close();
	}
}
