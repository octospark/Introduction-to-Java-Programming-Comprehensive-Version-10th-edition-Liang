package chapter12;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 2:12:43 PM
 * (Data sorted?) Write a program that reads the strings from file SortedStrings.txt 
 * and reports whether the strings in the files are stored in increasing order.
 * If the strings are not sorted in the file, displays the first two strings that are out
 * of the order.
 */
public class Exercise12_21 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/chapter12/SortedStrings.txt");
		Scanner output = new Scanner(file);
		ArrayList<String> list = new ArrayList<>();
		while (output.hasNext()) {
			String[] line = output.nextLine().split(" ");
			list.addAll(Arrays.asList(line));
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).compareTo(list.get(i + 1))> 0) {
				System.out.println("The strings are not sorted.");
				System.out.println("The first two non-sorted strings are " + list.get(i) +
						" and " + list.get(i + 1));
				System.exit(1);
			}
		}
		System.out.println("The strings are all sorted");
		output.close();
	}
}
