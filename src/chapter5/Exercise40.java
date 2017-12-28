package chapter5;
/*
 * Simulate a flipping coin.
 * Throw a coin 1000000 times and display the results
 */
public class Exercise40 {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < 1000000; i++) {
			int flip = (int)(Math.random() * 2);
			if (flip == 1) {
				heads++;
			}
			else {
				tails++;
			}
		}
		System.out.println("After 1000000 flips of a coin we have " + heads +
				" heads and " + tails + " tails");
	}
}
