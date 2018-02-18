package chapter11;
import java.util.ArrayList;
/**
 * @author Erlin Goce
 *
 * Feb 15, 2018 5:44:40 PM
 */
public class Exercise11_10 {
	public static void main(String[] args) {
		MyStack_2 stack = new MyStack_2();
		stack.add(5);
		stack.add(45);
		System.out.print(stack.peek());
	}
}
@SuppressWarnings("serial")
class MyStack_2 extends ArrayList<Object> {
	
	public Object peek() {
		return this.get(this.size() - 1);
	}
	
	public void push(Object o) {
		this.add(o);
	}
	
	
}
