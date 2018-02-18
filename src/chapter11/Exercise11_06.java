package chapter11;
import chapter9.SimpleCircle;
import chapter10.Loan;
import java.util.ArrayList;

/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 12:59:54 PM
 * 
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * object, a Date object, a string, and a Circle object to the list, and use a loop
 * to display all the elements in the list by invoking the object’s toString()
 * method.
 * (p.s some of the required classes are defined in their respective chapters)
 */
public class Exercise11_06 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new SimpleCircle());
		list.add(new String("here"));
		list.add(new Loan(5, 5, 10000));
		list.add(new MyDate());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).toString());
	}
}
