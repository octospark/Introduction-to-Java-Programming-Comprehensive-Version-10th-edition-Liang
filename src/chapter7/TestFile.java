/**
 * Made by Erlin Goce
 * Dec 23, 2017
 */
package chapter7;
import java.util.Arrays;
/**
 * @author pc
 *
 */
public class TestFile {
	public static void main(String[] args) {
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 7, 7, 10};
		Arrays.fill(list1, 5); // Fill 5 to the whole array
		java.util.Arrays.fill(list2, 1, 5, 8);
		for (int i = 0; i < list1.length; i++)
			System.out.println(list1[i]);
	}
}
