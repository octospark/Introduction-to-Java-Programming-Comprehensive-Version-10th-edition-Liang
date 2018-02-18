package chapter11;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 1:08:42 PM
 * 
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers.
 * public static void shuffle(ArrayList<Integer> list)
 * 
 */
public class Exercise11_07 {
	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 5, 6};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
		shuffle(list);
		System.out.println(list);
	}
	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int position = (int)(Math.random() * list.size());
			
			while(position == i)
				position = (int)(Math.random() * list.size());
			
			Integer temp = list.get(i);
			list.set(i, list.get(position));
			list.set(position, temp);
		}
	}
}
