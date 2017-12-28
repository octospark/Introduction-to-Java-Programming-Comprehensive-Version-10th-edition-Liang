/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise9 {
	public static void main(String[] args) {
		System.out.println("Feet      Meters     |     Meters      Feet");
		System.out.println("-------------------------------------------");
		double meters = 20;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-7.1f%8.3f      |     ", (double)i, footToMeter(i));
			System.out.printf("%-7.1f%10.3f\n", (double)meters, meterToFeet(meters));
			meters += 5;
		}
	}
	
	/** Converts from feet to meters */
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}
	
	/** Converts from meters to feet */
	public static double meterToFeet(double meter) {
		return 3.279 * meter;
	}
}
