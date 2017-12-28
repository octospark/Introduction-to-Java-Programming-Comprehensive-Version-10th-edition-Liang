package chapter5;

public class Exercise18D {
	public static void main(String[] args) {
		for (int i = 6; i >= 1; i--) {
			String line = "";// the line for the numbers
			//1. append the leading spaces
			for (int j = i; j <= 6; j++) {
				line += "  ";
			}
			//2. append the numbers to the line string
			for (int k = 1; k <= i; k++) {
				line += k + " ";
			}
			//3.print the result
			System.out.println(line);
		}
	}
}
