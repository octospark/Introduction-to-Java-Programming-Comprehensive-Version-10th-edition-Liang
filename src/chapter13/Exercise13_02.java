package chapter13;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Mar 17, 2018 6:49:00 PM
 * 
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of
 * numbers:
 * public static void shuffle(ArrayList<Number> list)
 */
public class Exercise13_02 {
	public static void main(String[] args) {
		ArrayList<Number> list= new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(15);
		shuffle(list);
		System.out.println(list.toString());
	}
	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			int randomPosition = (int)(Math.random() * list.size());
			while (randomPosition == i)
				randomPosition = (int)(Math.random() * list.size());
			Number temp = list.get(i);
			list.set(i, list.get(randomPosition));
			list.set(randomPosition, temp);
		}
	}
}
