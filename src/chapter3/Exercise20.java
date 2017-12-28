package chapter3;
import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user of temperature and speed
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in mises per hour: ");
		double speed = input.nextDouble();
		
		if (speed < 2 || temperature <-58 || temperature > 41)
			System.out.println("The speed or temperature are not in their defined ranges");
		else {
			// Compute wind chill index
			double windChillIndex = (35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16)
					+ 0.4275 * temperature * Math.pow(speed, 0.16));
			
			// Display results
			System.out.println("The wind chill index is " + windChillIndex);
		}
		input.close();
	}
}
