package chapter8;

import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 3:44:11 PM
 * 
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * have the same contents. Write a method that returns true if m1 and m2 are identical,
 * using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * and displays whether the two are identical.
 */
public class Exercise8_29 {
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
			System.out.println("The arrays are identical");
		else
			System.out.println("The arrays are not identical");
		input.close();
	}
	/* Return true if the arrays are identical*/
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++)
			for (int j = 0; j < m1[i].length; j++) {
				if (!isInArray(m2, m1[i][j]))
					return false;
				if (!isInArray(m1, m2[i][j]))
					return false;
				}
		return true;
	}
	/* Check if a a given element is present in an array*/
	public static boolean isInArray(int[][] m, int n) {
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (m[i][j] == n)
					return true;
		return false;
	}
}
