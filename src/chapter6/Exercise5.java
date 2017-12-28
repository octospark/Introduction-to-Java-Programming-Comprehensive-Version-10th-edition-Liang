/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;
import java.util.Scanner;
import chapter6.TestMax;
/**
 * @author pc
 *
 */
public class Exercise5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		displaySorted(number1, number2, number3);
		input.close();
	}
	public static void displaySorted(int n1, int n2, int n3) {
		int max = TestMax.max(TestMax.max(n1, n2), n3);
		int min = min(min(n1, n2), n3);
		int middle = TestMax.max(TestMax.max(min(n1, n2), min(n2, n3)), min(n1, n3));
		System.out.println(min + " " + middle + " " + max);
	}
	public static int min(int n1, int n2) {
		return (n1 > n2) ? n2:n1;
	}
}
