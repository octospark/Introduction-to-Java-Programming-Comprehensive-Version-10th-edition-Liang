package chapter7;

/**
 * @author pc
 *
 * Dec 27, 2017
 */
public class Exercise7_13 {
	public static void main(String[] args) {
		System.out.println(getRandom(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
	}
	public static int getRandom(int... numbers) {
		int randomNumber = (int)(Math.random() * 54 + 1);
		while (inArray(randomNumber, numbers))
			randomNumber = (int)(Math.random() * 54 + 1);
		return randomNumber;
	}
	public static boolean inArray(int number, int[] array) {
		for (int k: array) {
			if (number == k)
				return true;
		}
		return false;
	}
}
