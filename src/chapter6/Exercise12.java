/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise12 {
	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for (int i = (int)ch1; i <= (int)ch2; i++) {
			System.out.print((char)i + " ");
			count++;
			if (count % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
}
