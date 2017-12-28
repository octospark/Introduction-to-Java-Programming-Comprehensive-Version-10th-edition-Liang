package chapter3;
import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		// Create a Scanner and obtain the input from the user
		// regarding the rank and the suit
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rank of card (1-13). (1)-Ace, (11)-Jack, (12)-Queen, (13)-King: ");
		int rank = input.nextInt();
		
		System.out.print("Enter suit code (1)-Clubs, (2)-Diamonds, (3)-Hearts, (4)-Spades: ");
		int suit = input.nextInt();
		
		// Determine the rank and suit and print the results
		System.out.print("The card you picked is ");
		switch (rank) {
		case 1:
			System.out.print("Ace of ");
			break;
		case 2:
			System.out.print("2 of ");
			break;
		case 3:
			System.out.print("3 of ");
			break;
		case 4:
			System.out.print("4 of ");
			break;
		case 5:
			System.out.print("5 of ");
			break;
		case 6:
			System.out.print("6 of ");
			break;
		case 7:
			System.out.print("7 of ");
			break;
		case 8:
			System.out.print("8 of ");
			break;
		case 9:
			System.out.print("9 of ");
			break;
		case 10:
			System.out.print("10 of ");
			break;
		case 11:
			System.out.print("Jack of ");
			break;
		case 12:
			System.out.print("Queen of ");
			break;
		case 13:
			System.out.print("King of ");
			break;
		}
		
		switch(suit) {
		case 1:
			System.out.println("Clubs");
			break;
		case 2:
			System.out.println("Diamonds");
			break;
		case 3:
			System.out.println("Hearts");
			break;
		case 4:
			System.out.println("Spades");
		}
		input.close();
	}
}
