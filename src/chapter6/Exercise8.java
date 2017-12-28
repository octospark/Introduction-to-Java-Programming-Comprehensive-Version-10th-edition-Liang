/**
 * Made by Erlin Goce
 * Dec 21, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise8 {
	public static void main(String[] args) {
		testConversions();
	}
	public static void testConversions() {
		double k = 120;
		System.out.println("Celsius     Fahrenheit  |    Fahrenheit    Celsius");
		for (int i = 40; i >= 31; i--) {
			System.out.printf("%-12.1f%-7.1f     |      ", (double)i, celsiusToFahrenheit(i));
			System.out.printf("%-10.1f%7.2f\n", (double)k, fahrenheitToCelsius(k));
			k-=10;
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
