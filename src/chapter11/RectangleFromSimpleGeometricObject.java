package chapter11;

/**
 * @author Erlin Goce
 *
 * Feb 6, 2018 6:41:18 PM
 */
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
		
	}
	
	public RectangleFromSimpleGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return width */
	public double getWidth() {
		return width;
	}
	
	/** Set new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Return height */
	public double getHeight() {
		return height;
	}
	
	/** Set new height */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Return area */
	public double getArea() {
		return width * height;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
