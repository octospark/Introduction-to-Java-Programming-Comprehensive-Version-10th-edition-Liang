/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise32 {
	public static void main(String[] args) {
		final int ITERATIONS_LIMIT = 100000000;
		int countWins = 0;
		for (int i = 0; i < ITERATIONS_LIMIT; i++) {
			if (winOrLose())
				countWins++;
		}
		System.out.println(countWins);
	}
	public static int twoDiceRollSum() {
		int first = (int)(Math.random() * 6 + 1);
		int second = (int)(Math.random() * 6 + 1);
		return (first + second);
	}
	public static boolean winOrLose() {
		int rollSum = twoDiceRollSum();
		
		if (rollSum == 7 || rollSum == 11)
			return true;
		else if (rollSum == 2 || rollSum == 3 || rollSum == 12)
			return false;
		else {
			int rollPoint = rollSum;
			rollSum = twoDiceRollSum();
			while (!(rollSum == 7 || rollSum == rollPoint)) {
				rollSum = twoDiceRollSum();
				if (rollSum == 7) {
					break;
				}
				if (rollSum == rollPoint) {
					break;
				}
			}
			if (rollSum == 7)
				return false;
			else
				return true;
		}
	}
}
