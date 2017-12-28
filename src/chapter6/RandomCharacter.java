/**
 * Made by Erlin Goce
 * Dec 20, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class RandomCharacter {
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	/** Generate random lower case letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	
	/** Generate random upper case letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	
	/** Generate random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	/** Generate a random character */
	public static char getRandmCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
