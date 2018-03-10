package chapter12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 5:18:22 PM
 */
public class Exercise12_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		System.out.println(crawler(url, "Driver"));
		input.close();
	}
	/** Search the URLs for the given string and return the URL where the string is located */
	public static String crawler(String startingURL, String strToFind) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		boolean found = false; // The existence of the string
		String location = "";
		listOfPendingURLs.add(startingURL);
		while(!listOfPendingURLs.isEmpty() && !found) {
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraversedURLs.contains(urlString)) {
				listOfTraversedURLs.add(urlString);
				System.out.println("Crawl " + urlString);
				
				for (String s: getSubURLs(urlString)) {
					if (!listOfTraversedURLs.contains(s))
						listOfPendingURLs.add(s);
				}
			}
			try {
				for (int i = 0; i < listOfPendingURLs.size(); i++) {
					URL url = new URL(listOfPendingURLs.get(i));
					Scanner input = new Scanner(url.openStream());
					while (input.hasNext()) {
						String line = input.nextLine();
						if (line.contains(strToFind)) {
							found = true;
							location = listOfPendingURLs.get(i);
							break;
						}
					}
					if (found == true)
						break;
				}
			}
			catch(Exception ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}
		return location;
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
