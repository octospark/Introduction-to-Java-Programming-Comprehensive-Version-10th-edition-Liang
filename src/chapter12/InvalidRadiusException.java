package chapter12;

/**
 * @author Erlin Goce
 *
 * Feb 22, 2018 11:18:47 AM
 */
public class InvalidRadiusException extends Exception {
	private double radius;
	
	/** Construct an exception */
	public InvalidRadiusException(double radius) {
		super("Invalid radius " + radius);
		this.radius = radius;
	}
	
	/** Return the radius */
	public double getRadius() {
		return radius;
	}
}
