package chapter2;

public class ComputeArea {
	public static void main(String[] args){
		double radius;
		double area = 50;
		
		
		radius = 20;
		
		// Compute area
		area = radius * radius * 3.1415926;
		
		// Display results
		System.out.println("The area for the circle of radius " +
		radius + " is " + area);
		
	}
}
