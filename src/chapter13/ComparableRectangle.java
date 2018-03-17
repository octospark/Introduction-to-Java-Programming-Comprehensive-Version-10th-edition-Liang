package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 3:07:18 PM
 */
public class ComparableRectangle extends Rectangle {
	/** COnstruct a ComparableRectangle with the specified properties */
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}
	
	
	
	@Override // Implement the toString method in geometricObject
	public String toString() {
		return super.toString() + " Area: " + getArea();
	}
}
