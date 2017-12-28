/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		printPentagonalNumbers(100, 10);
	}
	public static void printPentagonalNumbers(int amount, int numbersPerLine) {
		for (int i = 1; i <= amount; i++) {
			System.out.print(getPentagonalNumber(i) + " ");
			if (i % numbersPerLine == 0) {
				System.out.println(getPentagonalNumber(i));
			}
		}
	}
	/** Get a pentagonal number and return it*/
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
