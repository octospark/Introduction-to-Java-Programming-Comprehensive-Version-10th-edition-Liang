package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 3:22:59 PM
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. Here are the
 * sample runs.
 */
public class Exercise8_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list 1: ");
		int[][] m1 = new int[3][3];
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				m1[i][j] = input.nextInt();
		
		System.out.print("Enter list 2: ");
		int[][] m2 = new int[3][3];
		for (int i = 0; i < m2.length; i++)
			for (int j = 0; j < m2[i].length; j++)
				m2[i][j] = input.nextInt();
		
		if (equals(m1, m2))
			System.out.println("The arrays are strictly identical");
		else
			System.out.println("The arrays are not strictly identical");
		input.close();
	}
	/* Return true if the arrays are strictly identical */
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++)
				if (m1[i][j] != m2[i][j])
					return false;
		return true;
	}
}
