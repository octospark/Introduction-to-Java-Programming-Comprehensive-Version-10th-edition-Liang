package chapter6;
import java.util.Scanner;
public class Exercise6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for the height of the line: ");
		int n = input.nextInt();
		displayPattern(n);
		input.close();
	}
	
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k >= 0; k--)
				System.out.print("   ");
			for (int j = i; j >= 1; j--) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}
}
