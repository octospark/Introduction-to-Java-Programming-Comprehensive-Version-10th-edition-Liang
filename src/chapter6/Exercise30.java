/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise30 {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		if (sum == 7 || sum == 11) {
			System.out.println("You win");
		}
		else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("You lose");
		}
		else {
			int point = sum;
			System.out.println("point is " + sum);
			do {
				dice1 = (int)(Math.random() * 6 + 1);
				dice2 = (int)(Math.random() * 6 + 1);
				sum = dice1 + dice2;
				if (sum == 7) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
					System.out.println("You lose");
					break;
				}
				else if (sum == point) {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
					System.out.println("You win");
					break;
				}
				else {
					System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
				}
			} while(!(sum == 7 || sum == point));
		}
	}
}
