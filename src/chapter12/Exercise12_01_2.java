package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 6:01:57 PM
 */
public class Exercise12_01_2 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java -cp bin chapter7.Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		int result = 0;
		if (!isDigit(args[0])) {
			System.out.println("Wrong Input: " + args[0]);
			System.exit(1);
		}
		if (!isDigit(args[2])) {
			System.out.println("Wrong Input: " + args[2]);
			System.exit(1);
		}
		switch (args[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '.':
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/':
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
				break;
		}
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
		
	}
	public static boolean isDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}
}
