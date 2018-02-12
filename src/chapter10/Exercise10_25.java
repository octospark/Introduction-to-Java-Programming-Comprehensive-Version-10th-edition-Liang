package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 31, 2018 1:53:33 PM
 */
public class Exercise10_25 {
	public static void main(String[] args) {
		printArray(split("#a#23?453", "[?#]"));
	}
	public static String[] split(String s, String regex) {
		int[] splitPoints = new int[s.length()];
		
		if (regex.length() == 1) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == regex.charAt(0))
					splitPoints[i] = 1;
			}
		}
		else {
			regex = regex.substring(1, regex.length() - 1);
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < regex.length(); j++) {
					if (regex.charAt(j) == s.charAt(i))
						splitPoints[i] = 1;
				}
			}
		}
		printArray(splitPoints);
		String[] substrings = new String[lengthOfArray(splitPoints)];
		int headPosition = 0;
		
		int substringPosition = 0;
		while (headPosition < splitPoints.length) {
			int headElement = splitPoints[headPosition];
			if (headElement == 1) {
				substrings[substringPosition] = s.substring(headPosition, headPosition + 1);
				
			}
			substringPosition++;
			headPosition++;
			
		}
		return substrings;
	}
	// Helper method to find the length of the array of substrings
	public static int lengthOfArray(int[] array) {
		int count = 1;
		int startValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (startValue != array[i]) {
				startValue = array[i];
				count++;
			}
		}
		for (int j = 0; j < array.length - 1; j++) {
			if (array[j] == array[j + 1] && array[j] == 1)
				count++;
		}
		
		return count;
	}
	public static void printArray(String[] s) {
		for (String k: s) {
			System.out.print(k + ", ");
		}
	}
	public static void printArray(int[] array) {
		for (int k: array)
			System.out.print(k + ", ");
	}
}
