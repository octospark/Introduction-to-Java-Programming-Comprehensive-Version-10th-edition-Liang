package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 19, 2018 10:26:24 AM
 */
public class TotalArea {
	public static void main(String[] args) {
		// Declare circleArray
		CircleWithPrivateDataFields[] circleArray;
		
		// Create circleArray
		circleArray = createCircleArray();
		
		// Print circleArray and total areas of teh circles
		printCircleArea(circleArray);
	}
	/** Create an array of the Circle objects */
	public static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}
		return circleArray;
	}
	
	/** Print an array of circles and their total area */
	public static void printCircleArea(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		
		System.out.println("-----------------------------------------");
		
		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "Total area of the circles is ",sum(circleArray));
	}
	
	/** Add circle areas */
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		double sum = 0;
		
		// Add areas to sum
		for (int i = 0; i < circleArray.length; i++)
			sum += circleArray[i].getArea();
		return sum;
	}
}
