package chapter12;
/**
 * @author Erlin Goce
 *
 * Mar 3, 2018 12:18:48 PM
 * 
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 */
public class Exercise12_10 {
	public static void main(String[] args) {
		try {
			String message = "Overload the memory ";
			while(true) {
				message += message;
			}
		}
		catch(OutOfMemoryError ex) {
			System.out.println(ex.getMessage());
		}
	}
}
