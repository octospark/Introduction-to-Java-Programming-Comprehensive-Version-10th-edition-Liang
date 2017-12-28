/**
 * Made by Erlin Goce
 * Dec 19, 2017
 */
package chapter6;

/**
 * @author pc
 *
 */
public class TestFile {
	public static void main(String[] args) {

	        int roll1 = rollDie();
	        int roll2 = rollDie();
	        System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + (roll1 + roll2));
	        System.out.println(getStats(roll1 + roll2));
	    }

	    public static String getStats(int n) {

	        if (n == 7 || n == 11) 
	        	return "You win.";
	        if (n == 2 || n == 3 || n == 12) 
	        	return "You lose.";

	        return "point is " + n;

	    }

	    public static int rollDie() {

	        return (int)(Math.random() * 6 + 1);
	    }
	}

