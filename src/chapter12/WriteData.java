package chapter12;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * @author Erlin Goce
 *
 * Mar 1, 2018 7:39:46 PM
 */
public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("src/chapter12/scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.close();
	}
}
