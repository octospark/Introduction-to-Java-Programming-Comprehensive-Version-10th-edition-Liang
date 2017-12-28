/**
 * Made by Erlin Goce
 * Dec 18, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class TestMax {
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}
	
	/** Return the max of two numbers */
	public static int max(int m1, int m2) {
		if (m1 > m2)
			return m1;
		else
			return m2;
	}
}
