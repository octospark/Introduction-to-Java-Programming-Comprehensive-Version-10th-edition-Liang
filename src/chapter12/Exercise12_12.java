package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 10:47:06 AM
 * 
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * 
 * Your program can be invoked from the command line with the Java sourcecode
 * file as the argument. It converts the Java source code to a new format. For
 * example, the following command converts the Java source-code file Test.java
 * to the end-of-line brace style.
 */
public class Exercise12_12 {
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
		ArrayList<String> list = new ArrayList<>();
		while (input.hasNext()) {
			String line = input.nextLine();
			if (line.contains("{") && line.replaceAll("\\s+", "").length() == 1) {
				line = line.replaceAll("\\s+", "");
			}
			list.add(line);
		}
		input.close();
		
		PrintWriter newFile = new PrintWriter(file);
		
		for (int i = 0; i < list.size() - 1; i++) {
			String first = list.get(i);
			String second = list.get(i + 1);
			if (second.contains("{") && second.length() == 1) {
				first = first + "{";
				list.set(i, first);
				second = "";
				list.set(i + 1, second);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).isEmpty()) {
				newFile.println(list.get(i));
			}
		}
		newFile.close();
	}
}
