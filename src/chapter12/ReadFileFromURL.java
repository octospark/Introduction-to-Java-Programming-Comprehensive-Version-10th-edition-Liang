package chapter12;
import java.util.Scanner;
import java.net.URL;
/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 1:05:41 PM
 */
public class ReadFileFromURL {
	public static void main(String[] args) {
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();
		
		try {
			URL url = new URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
			}
			System.out.println("The file size is " + count + " characters");
			input.close();
		}
		catch(java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch(java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
