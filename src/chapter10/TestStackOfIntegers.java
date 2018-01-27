package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 26, 2018 11:23:28 AM
 */
public class TestStackOfIntegers {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 0; i < 20; i++)
			stack.push(i);
		
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
