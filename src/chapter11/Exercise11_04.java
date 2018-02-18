package chapter11;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 11:46:33 AM
 * 
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * 
 */
public class Exercise11_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter a sequence of numbers, 0 ends the input: ");
		int value;
		do {
			value = input.nextInt();
			if (value != 0)
				list.add(value);
			
		} while (value != 0);
		
		System.out.println("The max value is " + max(list));
		input.close();
	}
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;
		Integer max = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (max.compareTo(list.get(i)) < 0)
				max = list.get(i);
		return max;
	}
}
