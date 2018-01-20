package chapter9;

/**
 * @author Erlin Goce
 *
 * Jan 13, 2018 12:35:28 PM
 */
public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is " +
		CircleWithStaticMembers.numberOfObjects);
		
		// Create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		// Display c1 before c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + 
				CircleWithStaticMembers.numberOfObjects + ")");
		
		// Create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		// Modify c1
		c1.radius = 9;
		
		// Display c1 and c2 After c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + 
				CircleWithStaticMembers.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + 
				CircleWithStaticMembers.numberOfObjects + ")");
	}
}
