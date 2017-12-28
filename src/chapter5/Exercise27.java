package chapter5;
/*
 *  The program displays the leap years from 101 to 2100
 * 
 * */
public class Exercise27 {
	public static void main(String[] args) {
		final int YEARS_PER_LINE = 10;
		int count = 0;
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				count++;
				System.out.print(i + " ");
				if(count % YEARS_PER_LINE == 0) {
					System.out.println();
				}
			}
		}
	}
}
