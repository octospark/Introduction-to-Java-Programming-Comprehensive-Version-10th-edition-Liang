package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 30, 2018 3:57:51 PM
 */
public class Exercise10_22 {
	public static void main(String[] args) {
		MyString1 s = new MyString1(new char[] {'a', 'b', 'c', 'd', 'e'});
		s.substring(0, 2).print();
	}
}
class MyString1 {
	private char[] chars;
	
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	
	public char charAt(int index) {
		return chars[index];
	}
	
	public int length() {
		return chars.length;
	}
	
	public MyString1 substring(int begin, int end) {
		char[] chars1 = new char[end-begin];
		MyString1 s = new MyString1(chars1);
		System.arraycopy(chars, begin, chars1, 0, end-begin);
		return s;
	}
	
	public MyString1 toLowerCase() {
		for (int i = 0; i < this.chars.length; i++) {
			chars[i] = Character.toLowerCase(chars[i]);
		}
		return this;
	}
	
	public boolean equals(MyString1 s) {
		if (s.chars.length != this.chars.length)
			return false;
		else {
			for (int i = 0; i < chars.length; i++) {
				if (s.chars[i] != this.chars[i])
					return false;
			}
			return true;
		}
	}
	
	public static MyString1 valueOf(int i) {
		char[] chars = Character.toChars(i);
		MyString1 s = new MyString1(chars);
		return s;
	}
	
	public void print() {
		for (int i = 0; i < chars.length; i++)
			System.out.print(chars[i]);
	}
}