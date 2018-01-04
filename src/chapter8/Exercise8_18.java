package chapter8;

/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 4:33:22 PM
 * (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 * array using the following header:
 * public static void shuffle(int[][] m)
 */
public class Exercise8_18 {
	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		shuffle(m);
		printArray(m);
	}
	/* Shuffle the rows in a two dimensional array */
	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int row = (int)(Math.random() * m.length);
			// Generate this number until it is different from current row
			while(row == i) {
				row = (int)(Math.random() * m.length);
			}
			// Swap the two values
			int temp[] = m[i];
			m[i] = m[row];
			m[row] = temp;
		}
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
