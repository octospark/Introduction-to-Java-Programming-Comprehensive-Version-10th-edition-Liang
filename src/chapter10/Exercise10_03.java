package chapter10;

/**
 * @author Erlin Goce
 *
 * Jan 28, 2018 2:12:15 PM
 */
public class Exercise10_03 {
	public static void main(String[] args) {
		MyInteger i1 = new MyInteger(71);
		MyInteger i2 = new MyInteger(45);
		System.out.println(i1.equals(i2));
		System.out.println(i1.isPrime());
		System.out.println(MyInteger.isOdd(i1));
		System.out.println(i2.isPrime());
		System.out.println(MyInteger.isPrime(i2));
		System.out.println(MyInteger.parseInt(new char[] {'1', '4', '8'}));
		System.out.println(MyInteger.parseInt("916781687"));
	}
}
class MyInteger{
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 != 0;
	}
	
	/** Return true if value of MyInteger object is prime*/
	public boolean isPrime() {
		int start  = 2;
		for (int i = start; i <= Math.sqrt(this.value); i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isEven(int value) {
		return value % 2 != 0;
	}
	
	/** Static method for prime property */
	public static boolean isPrime(int value) {
		int start  = 2;
		for (int i = start; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.getValue() % 2 == 0;
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.getValue() % 2 != 0;
	}
	
	/** Static method for prime property of an MyInteger object*/
	public static boolean isPrime(MyInteger myInt) {
		int start  = 2;
		for (int i = start; i <= Math.sqrt(myInt.getValue()); i++) {
			if (myInt.getValue() % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger myInt) {
		return this.value == myInt.getValue();
	}
	
	public static int parseInt(char[] ch) {
		String s = new String(ch);
		return parseInt(s);
	}
	
	public static int parseInt(String s) {
		int value = 0;
		int factor = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			int k = Character.getNumericValue(s.charAt(i));
			value += factor *  k;
			factor *= 10;
			
		}
		return value;
	}
}
