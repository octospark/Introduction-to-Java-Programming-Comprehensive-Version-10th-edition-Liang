package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 18, 2018 5:34:16 PM
 */
public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		// Create a circle with radius 5.0
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is "+
		myCircle.getArea());
		
		// Increase myCircle's area by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		printCircle(myCircle);
		System.out.println("The number of objects created is " +
				CircleWithPrivateDataFields.getNumberOfObjects());
	}
	public static void printCircle(CircleWithPrivateDataFields c) {
		System.out.println("The area of the circle of radius " + c.getRadius() + " is "+
				c.getArea());
	}
}
