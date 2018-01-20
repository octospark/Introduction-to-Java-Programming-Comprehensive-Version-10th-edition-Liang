package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 19, 2018 11:40:19 PM
 */
public class Rectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("r1 width is " + r1.getWidth());
		System.out.println("r1 height is " + r1.getHeight());
		System.out.println("r1 area is " + r1.getArea());
		System.out.println("r1 perimeter is " + r1.getPerimeter());
		
		System.out.println("r2 width is " + r2.getWidth());
		System.out.println("r2 height is " + r2.getHeight());
		System.out.println("r2 area is " + r2.getArea());
		System.out.println("r2 perimeter is " + r2.getPerimeter());
	}
	private double width = 1;
	private double height = 1;
	
	// The default no-arg constructor
	public Rectangle() {
	}
	
	// The arg constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * width + 2 * height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
