package chapter4;
import java.util.Scanner;
public class Exercise18 {
	public static void main(String[] args) {
		// The program asks for two characters. The first one is the first letter
		// of the major and the second is the year
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String data = input.next();
		char major = data.charAt(0);
		char year = data.charAt(1);
		
		String majorName = "";
		String yearName = "";
		
		switch(major) {
		case 'M':
			majorName = "Mathematics";
			break;
		case 'C':
			majorName = "Computer Science";
			break;
		case 'I':
			majorName = "Information Technology";
			break;
		}
		
		switch(year) {
		case '1':
			yearName = "Freshman";
			break;
		case '2':
			yearName = "Sophomore";
			break;
		case '3':
			yearName = "Junior";
			break;
		case '4':
			yearName = "Senior";
			break;
		}
		if (yearName != "" && majorName != "") {
			System.out.println(majorName + " " + yearName);
		}
		else{
			System.out.println("Invalid input");
		}
		input.close();
	}
}
