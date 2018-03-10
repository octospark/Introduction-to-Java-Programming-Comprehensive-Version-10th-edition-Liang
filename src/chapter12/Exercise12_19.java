package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 8:30:37 PM
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 */
public class Exercise12_19 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/Lincoln.txt");
		Scanner output = new Scanner(file);
		int count = 0;
		while(output.hasNext()) {
			String line = output.nextLine();
			line = line.replaceAll("[,.:-]", "");
			count += line.split(" ").length;
		}
		System.out.println("The file contains " + count + " words");
		output.close();
	}
}
