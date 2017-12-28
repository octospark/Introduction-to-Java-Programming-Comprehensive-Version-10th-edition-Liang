/**
 * Made by Erlin Goce
 * Dec 22, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class Exercise11 {
	public static void main(String[] args) {
		System.out.println("Sales Amount     Comsission");
		double sales = 10000;
		while (sales <= 100000) {
			System.out.printf("%-8d%15.1f\n", (int)sales, computeCommission(sales));
			sales += 5000;
		}
	}
	public static double computeCommission(double sales) {
		double commissions = 0;
		if (sales <= 5000)
			commissions = 0.08 * sales;
		else if (sales <= 10000)
			commissions = 0.08 * 5000 + 0.1 * (sales - 5000);
		else
			commissions = 0.08 * 5000 + 0.1 * 5000 + 0.12 * (sales - 10000);
		
		return commissions;
	}
}
