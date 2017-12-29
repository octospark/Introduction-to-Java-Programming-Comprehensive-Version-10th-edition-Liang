package chapter7;

/**
 * @author pc
 *
 * Dec 28, 2017
 * 
 * (Game: pick four cards) Write a program that picks four cards from a deck of 52
	cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
	12, and 11, respectively. Your program should display the number of picks that
	yields the sum of 24.
 */
public class Exercise7_29 {
	public static void main(String[] args) {
		/** We will count all the combinations of four cards from a deck of 52 cards
		 * and print the ones whose sum is 24 */
		int[] deck = new int[52];//dummy deck
		
		int count = 0; // count for all the combinations
		int countSum24 = 0; // count for the cards whose sum is 24
		// It is not elegant this solution due to the depth of the for loop structures :(
		for (int i = 0; i < deck.length - 3; i++)
			for (int j = i + 1;j < deck.length - 2; j++)
				for (int k = j + 1; k < deck.length - 1; k++)
					for (int m = k + 1; m < deck.length; m++) {
						int sum = numberedRank(i) + numberedRank(j) + numberedRank(k) + numberedRank(m);
						if (sum == 24)
							countSum24++;
						count++;
					}
		System.out.print("The number of combinations of four cards picked from a regular deck\n");
		System.out.println("whose sum is 24 is: " + countSum24);
		System.out.println("The total numebr of combinations is: " + count);
	}
	/* Returns the rank of the card based on the index of the deck, which ranges from 0 to 51*/
	public static int numberedRank(int cardIndexFromDeck) {
		return (cardIndexFromDeck % 13) + 1;
	}
}
