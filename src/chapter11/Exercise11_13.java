package chapter11;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 6:33:01 PM
 * 
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space.
 * 
 */
public class Exercise11_13 {
	public static void main(String[] args) {
		Integer[] array = {1, 4,  2, 3, 4, 5, 6, 4, 6, 3};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		removeDuplicate(list);
		System.out.println(list);
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		int step = 0;
		while (step < list.size()) {
			Integer keep = list.get(step);
			step++;
			int i = step;
			while (i < list.size()) {
				if (keep.equals(list.get(i))) {
					list.remove(i);
				} else {
					i++;
				}
			}
		}
	}
}
