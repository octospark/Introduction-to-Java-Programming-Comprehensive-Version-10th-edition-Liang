package chapter12;
import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;
/**
 * @author Erlin Goce
 *
 * Mar 2, 2018 1:17:31 PM
 */
public class WebCrawler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url);
		input.close();
	}
	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		listOfPendingURLs.add(startingURL);
		while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 400) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraversedURLs.contains(urlString)) {
				listOfTraversedURLs.add(urlString);
				System.out.println("Crawl " + urlString);
				
				for (String s: getSubURLs(urlString)) {
					if (!listOfTraversedURLs.contains(s))
						listOfPendingURLs.add(s);
				}
			}
		}
	}
	
	public static ArrayList<String> getSubURLs(String urlString){
		ArrayList<String> list = new ArrayList<>();
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("https:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("https:", endIndex);
					}
					else
						current = -1;
				}
			}
		}
		catch(Exception ex) {
			
			System.out.println("Error: " + ex.getMessage());
		}
		return list;
	}
}
