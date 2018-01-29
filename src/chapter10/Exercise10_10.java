package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 29, 2018 1:32:17 PM
 */
public class Exercise10_10 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
			//System.out.println(queue.getCapacity());
		}
		while (!queue.empty())
			System.out.print(queue.dequeue() + " ");
	}
}
class Queue {
	private int[] elements;
	private int size;
	private int capacity = 8;
	public Queue() {
		this.elements = new int[capacity];
	}
	
	public void enqueue(int v) {
		this.elements[size] = v;
		size++;
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			capacity *= 2;
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
	}
	
	public int dequeue() {
		int first = elements[0];
		size--;
		for (int i = 0; i < elements.length - 1; i++)
			elements[i] = elements[i + 1];// shifting the elements to the left
		return first;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
}
