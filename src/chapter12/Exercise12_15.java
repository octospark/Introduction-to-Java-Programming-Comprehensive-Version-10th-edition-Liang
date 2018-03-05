package chapter12;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 12:03:51 PM
 * 
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if
it does not exist. Write 100 integers created randomly into the file using text
I/O. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order
 */
public class Exercise12_15 {
	public static void main(String[] args) throws Exception {
		File file = new File("src\\chapter12\\Exercise12_15.txt");
		PrintWriter output = new PrintWriter(file);
		for (int i = 0; i < 100; i++) {
			int randomNumber = (int)(Math.random() * 300);
			output.write(randomNumber + " ");
		}
		output.close();
		
		Scanner input = new Scanner(file);
		int[] list = new int[100];
		String[] numbersInStringForm = input.nextLine().split(" ");
		for (int i = 0; i < 100; i++) {
			list[i] = Integer.parseInt(numbersInStringForm[i]);
		}
		input.close();
		
		Arrays.sort(list);
		for (int i = 0; i < 100; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
