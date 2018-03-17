package chapter13;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Mar 17, 2018 7:00:06 PM
 * 
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 */
public class Exercise13_03 {
	public static void main(String[] args) {
		ArrayList<Number> list= new ArrayList<>();
		list.add(9);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(15);
		sort(list);
		System.out.println(list.toString());
	}
	/** Selection sort */
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			Number currentMin = list.get(i);
			int currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.doubleValue() > list.get(j).doubleValue()) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
}
