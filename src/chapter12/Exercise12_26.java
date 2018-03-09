package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 6:44:25 PM
 * (Create a directory) Write a program that prompts the user to enter a directory
 * name and creates a directory using the File’s mkdirs method. The program
 * displays the message “Directory created successfully” if a directory is created
 * or “Directory already exists” if the directory already exists.
 */
public class Exercise12_26 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the directory: ");
		String nameOfDirectory = input.nextLine().trim();
		
		File file = new File("src/chapter12/" + nameOfDirectory);
		if (file.mkdir()) {
			System.out.println("Directory created successfully");
		}
		else {
			System.out.println("Directory already exists");
		}
		input.close();
	}
}
