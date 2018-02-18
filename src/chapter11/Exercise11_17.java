package chapter11;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Feb 17, 2018 11:54:52 AM
 * 
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 * m and find the smallest integer n such that m * n is a perfect square.
 */
public class Exercise11_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int integer = input.nextInt();
		int start = 1;
		while (Math.sqrt(start * integer) - (int)(Math.sqrt(start * integer)) != 0) {
			start++;
		}
		System.out.println("The smallest number n for m * n to be a perfec square is " + start);
		System.out.println("m * n is " + start * integer);
		input.close();
	}
}
