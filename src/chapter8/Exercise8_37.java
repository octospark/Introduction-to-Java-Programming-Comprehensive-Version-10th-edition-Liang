package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 6, 2018 11:58:55 AM
 * (Guess the capitals) Write a program that repeatedly prompts the user to enter
 * a capital for a state. Upon receiving the user input, the program reports whether
the answer is correct. Assume that 50 states and their capitals are stored in a twodimensional
array, as shown in Figure 8.10. The program prompts the user to
answer all states’ capitals and displays the total correct count. The user’s answer
is not case-sensitive.
 */
public class Exercise8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		String[][] stateCapitalArray = {
				{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
				{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
				{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
				{"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
				{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
				{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
				{"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"}, 
				{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
				{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
				{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
				{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
				{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
				{"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
				{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
				{"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
				{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
				{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
				{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
				{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
				{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
				{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
				{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
				{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
				{"Wyoming", "Cheyenne"}};
		for (int i = 0; i < stateCapitalArray.length; i++) {
			System.out.print("What is the cpital of " + stateCapitalArray[i][0] + "? ");
			String response = input.nextLine();
			if (response.toLowerCase().equals(stateCapitalArray[i][1].toLowerCase())) {
				correctCount++;
				System.out.println("You are correct!");
			}
			else {
				System.out.println("The correct answer chould be " + stateCapitalArray[i][1]);
			}
		}
		System.out.println("The correct count is " + correctCount);
		input.close();
	}
}
