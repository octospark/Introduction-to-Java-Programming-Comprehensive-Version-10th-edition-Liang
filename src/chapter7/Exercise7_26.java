package chapter7;
import java.util.Scanner;
/**
 * @author pc
 *
 * Dec 28, 2017
 */
public class Exercise7_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list 1: ");
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int i = 0; i < length1; i++)
			list1[i] = input.nextInt();
		
		System.out.print("Enter list 2: ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		for (int i = 0; i < length2; i++)
			list2[i] = input.nextInt();
		if (equals(list1, list2))
			System.out.println("The lists are strictly identical");
		else
			System.out.println("The lists are not striclty identical");
		input.close();
	}
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		for (int i = 0; i < list1.length; i++)
			if (list1[i] != list2[i])
				return false;
		return true;
	}
}
