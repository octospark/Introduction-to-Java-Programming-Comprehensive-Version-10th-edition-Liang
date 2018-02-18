package chapter11;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 6:08:16 PM
 * 
 * (Sort ArrayList) Write the following method that sorts an ArrayList of
 * numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.
 */
public class Exercise11_11 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(2);
		System.out.println(list);
		sort(list);
		System.out.println(list);

	}
	public static void sort(ArrayList<Integer> list) {
		int swaps = 1;
		while (swaps != 0) {
			swaps = 0;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) >= 0) {
					swaps++;
					Integer temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
				}
			}
		}
	}
}
