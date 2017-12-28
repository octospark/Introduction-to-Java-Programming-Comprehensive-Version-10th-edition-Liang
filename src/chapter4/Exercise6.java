package chapter4;


public class Exercise6 {
	public static void main(String[] args) {
		// This program generates three random points on the circle
		// centered at (0, 0) with radius 40 and displays the angles 
		// between the three points generated
		
		//1. Generate three random x values between the x values that the circle can take
		double x1 = -40 + Math.random() * 80;
		double x2 = -40 + Math.random() * 80;
		double x3 = -40 + Math.random() * 80;
		
		//2. The point is on the circle if x * x + y * y = r * r
		double y1 = Math.sqrt(40 * 40 - x1 * x1);
		double y2 = Math.sqrt(40 * 40 - x2 * x2);
		double y3 = Math.sqrt(40 * 40 - x3 * x3);
		
		//3. Calculate the sides of the triangle formed by the three points
		double side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double side2 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		
		// 4. Calculate the angles
		double A = Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3));
		double B = Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3));
		double C = Math.acos((side3 * side3 - side1 * side1 - side2 * side2) / (-2 * side1 * side2));
		
		A = Math.toDegrees(A);
		B = Math.toDegrees(B);
		C = Math.toDegrees(C);
		// double total = A + B + C;
		
		System.out.println("The there angles are " + Math.round(A * 100) / 100.0 + ", " +
		Math.round(B * 100) / 100.0 + " and " + Math.round(C * 100) / 100.0);
		
	}
}
