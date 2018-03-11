package chapter13;
import java.util.ArrayList;
import java.math.*;
/**
 * @author Erlin Goce
 *
 * Mar 11, 2018 3:02:45 PM
 */
public class LargestNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(34445.53);
		list.add(new BigDecimal("34323232323354354354101"));
		list.add(new BigDecimal("2.0909090909095435468716871686871"));
		
		System.out.println("The largest number is " + getLargestNumber(list));
	}
	
	public static Number getLargestNumber(ArrayList<Number> list) {
		if (list == null || list.size() == 0)
			return null;
		Number number = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		return number;
	}
}
