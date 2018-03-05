package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 11:35:40 AM
 * 
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument.
 */
public class Exercise12_13 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java chapter12.Exercise12_12 filename");
			System.exit(1);
		}
		
		File file = new File("C:\\Users\\pc\\Java Programming Liang Comprehensive\\src\\chapter12\\" + args[0]);
		
		if (!file.exists()) {
			throw new FileNotFoundException();
		}
		
		Scanner input = new Scanner(file);
		int lines = 0;
		int characters = 0;
		int words = 0;
		while (input.hasNext()) {
			String line = input.nextLine();
			lines++;
			characters += line.length();
			words += line.split("[,\\s]").length;
		}
		input.close();
		System.out.println("File " + args[0] + " has ");
		System.out.println(characters + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");
	}
}
