package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 11:55:40 AM
 * 
 * (Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and
 * average.
 */
public class Exercise12_14 {
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
		double total = 0;
		int count = 0;
		while (input.hasNext()) {
			String[] line = input.nextLine().trim().split(" ");
			count += line.length;
			for (int i = 0; i < line.length; i++)
				total += Double.parseDouble(line[i]);
		}
		input.close();
		System.out.println("The total is " + total);
		System.out.println("The average is " + total / count);
	}
}
