package chapter7;

/**
 * @author pc
 *
 * Dec 25, 2017
 */
public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java -cp bin chapter7.Calculator operand1 operator operand2");
			System.exit(0);

			int result = 0;

			// Determine the operator
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
	}
}
