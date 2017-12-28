package chapter4;

public class Exercise25 {
	public static void main(String[] args) {
		char firstLetter = (char)(65 + Math.random() * 26);
		char secondLetter = (char)(65 + Math.random() * 26);
		char thirdLetter = (char)(65 + Math.random() * 26);
		int firstNumber = (int)(Math.random() * 10);
		int secondNumber = (int)(Math.random() * 10);
		int thirdNumber = (int)(Math.random() * 10);
		int fourthNumber = (int)(Math.random() * 10);
		
		String plate ="" + firstLetter + secondLetter + thirdLetter + firstNumber + secondNumber + 
				thirdNumber + fourthNumber;
		System.out.println(plate);
	}
}
