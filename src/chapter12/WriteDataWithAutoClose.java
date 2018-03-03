package chapter12;

import java.io.File;
import java.io.PrintWriter;

/**
 * @author Erlin Goce
 *
 * Mar 1, 2018 8:08:10 PM
 */
public class WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception{
		File file = new File("src/chapter12/scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		try (PrintWriter output = new PrintWriter(file);){
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
}
