package chapter3;

import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		// Create a scanner and get from the user the points of the segment
		// and the point whose position we will determine in relation to the segment
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1 and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// determine position
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		double maxX = x1;
		double minX = x0;
		if (x0 > x1) {
			maxX = x0;
			minX = x1;
		}
		
		if (position == 0 && (x2 <= maxX && x2 >= minX )) {
			System.out.append("(" + x2 + ", " + y2 + ") is on the line segment from (" + 
					x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
		else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + 
					x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
		input.close();
	}
}
