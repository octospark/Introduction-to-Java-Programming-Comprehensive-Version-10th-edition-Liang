package chapter9;
import java.util.Random;
/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 4:57:59 PM
 */
public class Exercise9_4 {
	public static void main(String[] args) {
		Random r = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(r.nextInt(100));
		}
		
	}
}
