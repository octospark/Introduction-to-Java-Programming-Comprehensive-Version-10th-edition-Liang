/**
 * Made by Erlin Goce
 * Dec 19, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Increment {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before teh call, x is " + x);
		increment(x);
		System.out.println("After the call, x is " + x);
	}
	public static void increment(int n) {
		n++;
		System.out.println("n inside the method is " + n);
	}
}
