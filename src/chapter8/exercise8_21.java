package chapter8;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Jan 3, 2018 4:57:19 PM
 * (Central city) Given a set of cities, the central city is the city that has the shortest
 * total distance to all other cities. Write a program that prompts the user to enter
 * the number of the cities and the locations of the cities (coordinates), and finds
 * the central city and its total distance to all other cities.
 */
public class exercise8_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int number = input.nextInt();
		double[][] coordinates = new double[number][2];
		System.out.print("Enter coordinates for " + number + " cities");
		for (int i = 0; i < coordinates.length; i++)
			for (int j = 0; j < coordinates[i].length; j++)
				coordinates[i][j] = input.nextDouble();
		double distanceMin = 10000000;
		int pointIndex= 0;
		
		for (int i = 0; i < coordinates.length; i++) {
			double distanceSum = 0;
			for (int j = 0; j < coordinates.length; j++ ) {
				distanceSum += distance(coordinates[i][0], coordinates[i][1], 
						coordinates[j][0], coordinates[j][1]);
			}
			if (distanceSum < distanceMin) {
				distanceMin = distanceSum;
				pointIndex = i;
			}
		}
		System.out.println("Central city is (" +coordinates[pointIndex][0] + ", " +
		coordinates[pointIndex][1] + ")");
		System.out.println("Minimum distance is " + distanceMin);
		input.close();
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
}
