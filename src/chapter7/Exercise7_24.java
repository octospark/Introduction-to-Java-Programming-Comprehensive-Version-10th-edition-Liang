package chapter7;

/**
 * @author pc
 *
 * Dec 27, 2017
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to pick objects from
 * a set of objects repeatedly and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from
 * a shuffled deck of 52 cards repeatedly and find out how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in the deck
 * before picking another. Write a program to simulate the number of picks needed
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice)
 */
public class Exercise7_24 {
	public static void main(String[] args) {
		
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
				"Jack", "Queen", "King"};
		
		int[] suitsNumber = new int[4];
		int count = 0;
		while (zeroExists(suitsNumber)) {
			int suitIndex = (int)(Math.random() * suits.length);
			int rankIndex = (int)(Math.random() * ranks.length);
			if (suitsNumber[suitIndex] == 0) {
				System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);
				suitsNumber[suitIndex] = 1;
			}
			count++;
		}
		System.out.println(count);
	}
	/** Auxiliary function. Check if the array of the suit indexes has at least one zero
	 * , meaning that we can keep on generating a random card.*/
	public static boolean zeroExists(int[] array) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == 0)
				return true;
		return false;
	}
}
