package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 17, 2018 7:40:58 PM
 * 
 * (Enable GeometricObject comparable) Modify the GeometricObject class
 * to implement the Comparable interface, and define a static max method in the
 * GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write
 * a test program that uses the max method to find the larger of two circles and the
 * larger of two rectangles.
 */
public class Exercise13_05 {
	public static void main(String[] args) {
		GeometricObject o1 = new Circle(2);
		GeometricObject o2 = new Circle(5);
		GeometricObject o3 = new Rectangle(2, 5);
		GeometricObject o4 = new Rectangle(2, 7);
		
		System.out.println(GeometricObject.max(o1, o2).getArea());
		System.out.println(GeometricObject.max(o3, o4).getArea());
	}
}
