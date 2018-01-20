package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 18, 2018 7:44:39 PM
 */
public class TestPassObject {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
		
		// Print areas for radius 1, 2, 3, 4 and 5
		int n = 5;
		printAreas(myCircle, n);
	}
	public static void printAreas(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius  \t\tArea");
		while (times >= 1) {
			System.out.println(c.getRadius() + "\t\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
