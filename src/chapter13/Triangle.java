package chapter13;
import java.util.Scanner;
/**
 * @author Erlin Goce
 *
 * Mar 17, 2018 6:16:36 PM
 * 
 * (Triangle class) Design a new Triangle class that extends the abstract
 * GeometricObject class. Draw the UML diagram for the classes Triangle
 * and GeometricObject and then implement the Triangle class. Write a test
 * program that prompts the user to enter three sides of the triangle, a color, and a
 * Boolean value to indicate whether the triangle is filled. The program should create
 * a Triangle object with these sides and set the color and filled properties using
 * the input. The program should display the area, perimeter, color, and true or false
 * to indicate whether it is filled or not.
 */
public class Triangle extends GeometricObject {
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three values for the sides of the triangle, color and filled value: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String color = input.next();
		boolean filled = input.nextBoolean();
		
		try {
			Triangle t = new Triangle(side1, side2, side3, color, filled);
			System.out.println("The area is: " + t.getArea());
			System.out.println("The perimeter is: " + t.getPerimeter());
			System.out.println("The color is: " + t.getColor());
			System.out.println("The filled value is: " + t.isFilled());
			System.out.println("The triangle was created on: " + t.getDateCreated());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			input.close();
		}
	}
	private double side1;
	private double side2;
	private double side3;
	
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) throws Exception {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		if (!isValidTriangle())
			throw new Exception("Error: Invalid values for sides of triangle");
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) throws
																Exception{
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		if (!isValidTriangle())
			throw new Exception("Error: Invalid values for sides of given triangle");
		setColor(color);
		setFilled(filled);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	/** Get the area of the triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	/** Get the perimeter of a triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	/** return false if the sides given do not make a triangle */
	public boolean isValidTriangle() {
		if((side1 + side2 <= side3 || side2 + side3 <= side1) || side1 + side3 <= side2)
			return false;
		return true;
	}
}
