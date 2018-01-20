package chapter9;
import java.util.Date;
/**
 * @author Erlin Goce
 *
 * Jan 20, 2018 4:53:47 PM
 */
public class Exercise9_3 {
	public static void main(String[] args) {
		long elapsed = 10000;
		
		for (int i = 0; i < 8; i++) {
			Date d = new Date(elapsed);
			System.out.println(d.toString());
			elapsed *= 10;
		}
	}
}
