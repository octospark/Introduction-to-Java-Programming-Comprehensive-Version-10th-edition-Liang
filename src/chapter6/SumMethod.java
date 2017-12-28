/**
 * Made by Erlin Goce
 * Dec 18, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class SumMethod {
	public static void main(String[] args) {
		System.out.println("Sum from 1 to 10 is " + sum(1, 10));
		System.out.println("Sum from 20 to 37 is " + sum(20, 37));
		System.out.println("Sum from 35 to 49 is " + sum(35, 49));
	}
	public static int sum(int i1, int i2) {
		int result = 0;
		for (int i = i1; i <= i2; i++)
			result += i;
		return result;
	}
}

