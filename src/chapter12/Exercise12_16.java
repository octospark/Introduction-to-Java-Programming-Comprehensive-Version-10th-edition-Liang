package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 12:15:41 PM
 */
public class Exercise12_16 {
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			System.out.println("Usage: java ReplaceText sourceFile oldStr newStr");
			System.exit(1);
		}
		
		// Check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}
		ArrayList<String> list = new ArrayList<>();
		
		try(
			Scanner input = new Scanner(sourceFile);
		)	{
			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[1], args[2]);
				list.add(s2);
			}
			input.close();
		}
		
		PrintWriter output = new PrintWriter(sourceFile);
		for (int i = 0; i < list.size(); i++)
			output.println(list.get(i));
		output.close();
	}
}
