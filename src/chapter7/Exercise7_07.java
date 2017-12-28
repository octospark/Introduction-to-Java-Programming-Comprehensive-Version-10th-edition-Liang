package chapter7;

/**
 * @author pc
 *
 * Dec 26, 2017
 */
public class Exercise7_07 {
	public static void main(String[] args) {
		int[] frequencies = new int[10];
		for (int i = 0; i < 100; i++) {
			int number = (int)(Math.random() * 10);
			frequencies[number]++;
		}for (int i = 0; i < frequencies.length; i++) {
			System.out.println(i + ", " + frequencies[i]);
		}
	}
}
