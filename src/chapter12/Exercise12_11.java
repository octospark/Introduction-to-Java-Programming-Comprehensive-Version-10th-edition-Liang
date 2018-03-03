package chapter12;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 12:33:46 PM
 * 
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * 		java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 */
public class Exercise12_11 {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java chapter12.Exercise12_11 strToRemove filename");
			System.exit(1);
		}
		
		File file = new File("C:\\Users\\pc\\Java Programming Liang Comprehensive\\src\\chapter12\\" + args[1]);
		
		if (!file.exists()) {
			System.out.println("Error: file does not exist");
			System.exit(2);
		}
		Scanner input = new Scanner(file);
		ArrayList<String> list = new ArrayList<>();
		while (input.hasNext()) {
			String line = input.nextLine();
			line = line.replaceAll(args[0], "");
			list.add(line);
		}
		input.close();
		PrintWriter newFile = new PrintWriter(file);
		for (int i = 0; i < list.size(); i++) {
			newFile.println(list.get(i));
		}
		newFile.close();
	}
	
}
