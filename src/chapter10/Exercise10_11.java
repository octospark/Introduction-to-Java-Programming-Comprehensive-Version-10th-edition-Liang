package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 3:19:11 PM
 */
public class Exercise10_11 {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this(0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public boolean contains(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y)) <= radius;
	}
	
	public boolean contains(Circle2D circle) {
		double distanceBetweenCenters = Math.sqrt((this.x - circle.x) * (this.x - circle.x) +
				(this.y - circle.y) * (this.y - circle.y));
		return distanceBetweenCenters + circle.getRadius() <= this.getRadius();
	}
	
	public boolean overlaps(Circle2D circle) {
		double distanceBetweenCenters = Math.sqrt((this.x - circle.x) * (this.x - circle.x) +
				(this.y - circle.y) * (this.y - circle.y));
		return !contains(circle) && (distanceBetweenCenters < (circle.radius + this.radius));
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
}
