package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 1, 2018 9:36:04 PM
 */
public class ReadData {
	public static void main(String[] args) throws Exception{
		File file = new File("src/chapter12/scores.txt");
		
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " " + mi + " " + lastName + " " + score);
		}
		input.close();
	}
}
