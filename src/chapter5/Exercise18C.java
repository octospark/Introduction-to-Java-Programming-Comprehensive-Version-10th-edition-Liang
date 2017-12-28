package chapter5;

public class Exercise18C {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			String line = "";
			for (int k = 6; k >= i; k--) {
				line += "  ";
			}
			for (int j = i; j >= 1; j--) {
				line += j + " ";
			}
			System.out.println(line);
		}
	}
}
