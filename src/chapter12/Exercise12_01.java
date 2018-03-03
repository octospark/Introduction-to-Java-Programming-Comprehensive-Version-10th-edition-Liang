package chapter12;

/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 5:46:48 PM
 * 
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline
 * calculator. Note that the program terminates if any operand is nonnumeric.
 * Write a program with an exception handler that deals with nonnumeric operands;
 * then write another program without using an exception handler to achieve the
 * same objective. Your program should display a message that informs the user of
 * the wrong operand type before exiting
 */
public class Exercise12_01 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java -cp bin chapter7.Calculator operand1 operator operand2");
			System.exit(0);
		}
		
		int result = 0;

		// Determine the operator
		try {
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
		catch(NumberFormatException ex) {
			String[] str = ex.toString().split(" ");
			System.out.println("Wrong input: " + str[str.length - 1]);
		}
		
	}
}
