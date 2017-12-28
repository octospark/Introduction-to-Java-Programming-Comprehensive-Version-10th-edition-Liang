package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		String[] names = new String[number];
		double[] scores = new double[number];
		System.out.println("Enter " + number + " names and scores: ");
		for (int i = 0; i < number; i++) {
			names[i] = input.next();
			scores[i] = input.nextDouble();
		}
		selectionSortCustom(scores, names);
		for (int i = 0; i < number; i++) {
			System.out.println(names[i] + " " + scores[i]);
		}
		input.close();
	}
	public static void selectionSortCustom(double[] list, String[] names) {
		for (int i = 0; i < list.length - 1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			String currentMinName = names[i];
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin < list[j]) {
					currentMin = list[j];
					currentMinName = names[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				names[currentMinIndex] = names[i];
				list[i] = currentMin;
				names[i] = currentMinName;
			}
		}
	}
}
