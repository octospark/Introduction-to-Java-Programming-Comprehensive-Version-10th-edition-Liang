package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 31, 2018 1:14:48 PM
 */
public class Exercise10_23 {
	public static void main(String[] args) {
		
	}
}
class MyString2 {
	private String s;
	
	public MyString2(String s) {
		this.s = s;
	}
	
	public int compare(String s) {
		int length = (this.s.length() > s.length()) ? s.length() : this.s.length();
		for (int i = 0; i < length; i++)
			if (s.charAt(i) != this.s.charAt(i))
				return this.s.charAt(i) - s.charAt(i);
		return -1 * Math.abs(s.length() - this.s.length());
	}
	
	public MyString2 substring(int begin) {
		String s  = this.s.substring(begin);
		return new MyString2(s);
	}
	
	public MyString2 toUpperCase() {
		String s  = this.s.toUpperCase();
		return new MyString2(s);
	}
	
	public char[] toChars() {
		char[] ch = this.s.toCharArray();
		return ch;
	}
	
	public static MyString2 valueOf(boolean b) {
		return new MyString2(String.valueOf(b));
	}
}
