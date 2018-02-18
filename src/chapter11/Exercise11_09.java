package chapter11;
import java.util.Scanner;
import java.util.ArrayList;
import chapter11.Exercise11_04;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 1:59:38 PM
 */
public class Exercise11_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size in n: ");
		int n = input.nextInt();
		ArrayList<Integer> rowsIndices = new ArrayList<>();
		ArrayList<Integer> columnsIndices = new ArrayList<>();
		
		for (int i = 0; i < n; i++)
			columnsIndices.add(0);
		
		for (int i = 0; i < n; i++) {
			int countRows = 0;
			
			for (int j = 0; j < n; j++) {
				int randomDigit = (int)(Math.random() * 2);
				System.out.print(randomDigit);
				if (randomDigit == 1) {
					countRows++;
					columnsIndices.set(j, columnsIndices.get(j) + 1);
					}
			}
			rowsIndices.add(i, countRows);
			System.out.println();
		}
		System.out.println(rowsIndices);
		System.out.println(columnsIndices);
		System.out.print("The largest row index : ");
		printMaxValues(rowsIndices);
		System.out.print("\nThe largest column index: ");
		printMaxValues(columnsIndices);
		input.close();
	}
	public static void printMaxValues(ArrayList<Integer> list) {
		Integer max = Exercise11_04.max(list);
		int countMaxValues = 0;
		for (int i = 0; i < list.size(); i++) {
			if (max.equals(list.get(i)))
				countMaxValues++;
		}
		if (countMaxValues == 1)
			System.out.print(max);
		else {
			for (int i = 0; i < list.size(); i++) {
				if (max.equals(list.get(i)))
					System.out.print(i + ", ");
			}
		}
	}
}
