package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 26, 2018 11:25:07 AM
 */
public class StackOfIntegers {
	private int[] elements;
	private int size;
	
	public StackOfIntegers() {
		this.elements = new int[16];
	}
	
	public StackOfIntegers(int capacity) {
		this.elements = new int[capacity];
	}
	
	public boolean empty() {
		if (size == 0)
			return true;
		else
			return false;
	}
	
	public int peek() {
		return elements[size - 1];
	}
	
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		size++;
		elements[size - 1] = value;
	}
	public int pop() {
		int value = elements[size - 1];
		elements[size - 1] = 0;
		size--;
		return value;
	}
	
	public int getSize() {
		return size;
	}
}
