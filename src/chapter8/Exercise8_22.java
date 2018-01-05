package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 4, 2018 11:17:03 AM
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * every column have an even number of 1s. We are also checking this condition
 * for a million cases.
 */
public class Exercise8_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int size = input.nextInt();
		int[][] matrix = randomBinarySquareArray(size);
		int countTrueOnes = 0;
		for (int i = 0; i < 1000000; i++) {
			if (allEvenOnes(matrix))
				countTrueOnes++;
			matrix = randomBinarySquareArray(size);
		}
		System.out.println(countTrueOnes);
		input.close();
	}
	public static boolean allEvenOnes(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int countOnesByRow = 0;
			int countOnesByColumn = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					countOnesByRow++;
				if (m[j][i] == 1)
					countOnesByColumn++;
			}
			if (countOnesByRow % 2 != 0 || countOnesByColumn % 2 != 0)
				return false;
		}
		return true;
	}
	/** Generate a matrix filled with random binary values */
	public static int[][] randomBinarySquareArray(int size){
		int[][] array = new int[size][size];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int random = (int)(Math.random() * 2);
				array[i][j] = random;
			}
		}
		return array;
	}
}
