package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 14, 2018 7:19:32 PM
 */
public class TestRationalClass {
	public static void main(String[] args) {
		// Create and initialize two rational numbers
		Rational r1 = new Rational(4, 2);
		Rational r2 = new Rational(2, 3);
		
		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
		System.out.println(r1.compareTo(r2));
	}
}
