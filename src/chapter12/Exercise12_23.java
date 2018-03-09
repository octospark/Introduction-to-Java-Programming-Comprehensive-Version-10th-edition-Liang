package chapter12;
import java.util.Scanner;
import java.io.File;
/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 5:30:56 PM
 * 
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */
public class Exercise12_23 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/Scores3.txt");
		Scanner output = new Scanner(file);
		int total = 0;
		int numberOfScores = 0;
		while(output.hasNext()) {
			String[] line = output.nextLine().split(" ");
			for (int i = 0; i < line.length; i++) {
				total += Integer.parseInt(line[i]);
				numberOfScores++;
			}
		}
		System.out.println("The total of th scores is: " + total);
		System.out.println("The average is: " + (1.0 * total / numberOfScores));
		output.close();
	}
}
