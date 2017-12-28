/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter6;
import chapter6.RandomCharacter;
/**
 * @author pc
 *
 */
public class Exercise38 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(RandomCharacter.getRandomUpperCaseLetter());
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(RandomCharacter.getRandomDigitCharacter());
			}
			System.out.println();
		}
	}
}
