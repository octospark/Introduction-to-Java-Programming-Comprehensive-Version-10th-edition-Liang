package chapter12;

import java.util.Scanner;
import java.io.File;

/**
 * @author Erlin Goce
 *
 * Mar 4, 2018 12:35:21 PM
 * (Game: hangman) Rewrite Programming Exercise 7.35. The program reads the
 * words stored in a text file named hangman.txt. Words are delimited by spaces.
 */
public class Exercise12_17 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("src/chapter12/hangman.txt");
		Scanner inputFromFile = new Scanner(file);
		
		String[] words = inputFromFile.nextLine().split(" ");
		inputFromFile.close();
		Scanner input= new Scanner(System.in);
		while(true) {
			int randomIndex = (int)(Math.random() * words.length);
			String randomWord = words[randomIndex];
			char[] randomWordChars = stringToChars(randomWord);
			
			String hiddenWord = "";
			for (int i = 0; i < randomWord.length(); i++)
				hiddenWord += "*";
			char[] hiddenWordChars = stringToChars(hiddenWord);
			
			int countMisses = 0;
			
			while(hasStars(hiddenWordChars)) {
				System.out.print("(Guess) Enter a letter in word " + charsToString(hiddenWordChars) + "  ");
				String s = input.next();
				char ch = s.charAt(0);
				
				if (!hasChar(hiddenWordChars, ch) && hasChar(randomWordChars, ch)) {
					transferChars(ch, randomWordChars, hiddenWordChars);
				}
				else if (hasChar(randomWordChars, ch)) {
					System.out.println(ch + " is already in word");
				}
				else {
					System.out.println(ch + " is not in word");
					countMisses++;
				}
			}
			System.out.print("The word is " + charsToString(hiddenWordChars));
			System.out.println(". You missed " + countMisses + " times");
			System.out.println("Do you want to guess another time? y/n ");
			String str = input.next();
			if (str.charAt(0) == 'n')
				break;
		}
		input.close();
	}
	/** The method transfers the character ch from chars1 to chars2 in the same positions
	 * The method assumes the chars lists have the same length*/
	public static void transferChars(char ch, char[] chars1, char[] chars2) {
		for (int i = 0; i < chars1.length; i++) {
			if (ch == chars1[i])
				chars2[i] = ch;
		}
	}
	/** Returns true if a chars list has a given character*/
	public static boolean hasChar(char[] chars, char ch) {
		for (int i = 0; i < chars.length; i++)
			if (ch == chars[i])
				return true;
		return false;
	}
	
	public static char[] stringToChars(String s) {
		char[] chars = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			chars[i] = s.charAt(i);
		return chars;
	}
	
	public static String charsToString(char[] chars) {
		String s = "";
		for (int i = 0; i < chars.length; i++)
			s += chars[i];
		return s;
	}
	
	public static boolean hasStars(char[] chars) {
		for (int i = 0; i < chars.length; i++)
			if (chars[i] == '*')
				return true;
		return false;
	}
}

