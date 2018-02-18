package chapter11;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 16, 2018 6:18:01 PM
 * 
 * (Combine two lists) Write a method that returns the union of two array lists of
 * integers using the following header:
 * public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated by
 * exactly one space in the output.
 */
public class Exercise11_14 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five elements for the first list: ");
		for (int i = 0; i < 5; i++)
			list1.add(input.nextInt());
		System.out.print("Enter five elements for the second list: ");
		for (int i = 0; i < 5; i++)
			list2.add(input.nextInt());
		ArrayList<Integer> union = union(list1, list2);
		System.out.println(union);
		input.close();
	}
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for (int i = 0; i < list2.size(); i++)
			list1.add(list2.get(i));
		return list1;
	}
}
