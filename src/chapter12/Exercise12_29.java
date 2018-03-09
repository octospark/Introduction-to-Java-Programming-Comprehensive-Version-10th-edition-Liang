package chapter12;

import java.io.File;

/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 7:50:38 PM
 * 
 * (Rename files) Suppose you have a lot of files in a directory named Exercisei_j,
 * where i and j are digits. Write a program that pads a 0 before j if j is a single
 * digit. For example, a file named Exercise2_1 in a directory will be renamed to
 * Exercise2_01. In Java, when you pass the symbol * from the command line,
 * it refers to all files in the directory (see Supplement III.V). Use the following
 * command to run your program.
 */
public class Exercise12_29 {
	public static void main(String[] args) {
		/** Same as Exercise12_27 and Exercise12_28 save for a small change*/
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("Exercise")) {
				String fileName = args[i];
				File file = new File(args[i]);
				String IAndJ = fileName.substring(8).split("\\.")[0];
				String I = IAndJ.split("_")[0];
				String J = IAndJ.split("_")[1];
		
				if (J.length() == 1)
					J = "0" + J;
				String newFileName = "Exercise" + I + "_" + J + ".java";
				file.renameTo(new File(newFileName));
			}
		}
	}
}
