package chapter5;

public class Exercise43 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				count++;
			}
		}
		System.out.print("The total number of all combination is " + count);
		
	}
}
