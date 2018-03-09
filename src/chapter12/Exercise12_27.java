package chapter12;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 6:54:38 PM
 * 
 * (Replace words) Suppose you have a lot of files in a directory that contain
 * words Exercisei_j, where i and j are digits. Write a program that pads a 0
 * before i if i is a single digit and 0 before j if j is a single digit. For example,
 * the word Exercise2_1 in a file will be replaced by Exercise02_01. In Java,
 * when you pass the symbol * from the command line, it refers to all files in
 * the directory (see Supplement III.V).
 * (Path at my pc) java -cp "C:\Users\pc\Java Programming Liang Comprehensive\bin" chapter12.Exercise12_27 *
 */
public class Exercise12_27 {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("Exercise")) {
				String fileName = args[i];
				File file = new File(args[i]);
				String IAndJ = fileName.substring(8).split("\\.")[0];
				String I = IAndJ.split("_")[0];
				String J = IAndJ.split("_")[1];
				if (I.length() == 1)
					I = "0" + I;
				if (J.length() == 1)
					J = "0" + J;
				String newFileName = "Exercise" + I + "_" + J + ".java";
				file.renameTo(new File(newFileName));
			}
		}
	}
}
