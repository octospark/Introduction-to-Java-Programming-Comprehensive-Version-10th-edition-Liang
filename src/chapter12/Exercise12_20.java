package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Erlin Goce
 *
 * Mar 10, 2018 7:28:11 PM
 * 
 * (Remove package statement) Suppose you have Java source files under the
 * directories chapter1, chapter2, . . . , chapter34. Write a program to
 * remove the statement package chapteri; in the first line for each Java
 * source file under the directory chapteri. Suppose chapter1, chapter2,
 * . . . , chapter34 are under the root directory srcRootDirectory. The root
 * directory and chapteri directory may contain other folders and files. Use
 * the following command to run the program:
 * java Exercise12_20 srcRootDirectory
 */
public class Exercise12_20 {
	private static Scanner output;

	public static void main(String[] args) throws Exception{
		if (args.length != 1) {
			System.out.println("Usage: java chapter12.Exercise12_18 rootDirectory");
			System.exit(1);
		}
		File rootDirectory = new File(args[0]);
		if (!rootDirectory.exists()) {
			throw new FileNotFoundException();
		}
		
		ArrayList<File> filesList = getFiles(rootDirectory);
		
		for (File file: filesList) {
			String pathFile = file.toString();
			String[] pathElements = pathFile.split("\\\\");
			
			String chapterName = pathElements[pathElements.length - 2];// Get the chapter name
			
			output = new Scanner(file);
			ArrayList<String> fileContents = new ArrayList<>();
			
			boolean hasChapterPackage = false;
			while(output.hasNext()) {
				String line = output.nextLine();
				// We assume that the chapter part is in the first line
				if (!line.contains(chapterName)) {
					fileContents.add(line);
					
				}
				else
					hasChapterPackage = true;
				
			}
			if (hasChapterPackage) {
				System.out.println("The file " + file.toString() + " will be changed");
				PrintWriter newFile = new PrintWriter(file);
				for (int i = 0; i < fileContents.size(); i++)
					newFile.println(fileContents.get(i));
				newFile.close();
			}
		}
	}
	
	/** Return the list of files in a root directory that contains other directories */
	public static ArrayList<File> getFiles(File rootDirectory) {
		File[] rootFilesAndFolders = rootDirectory.listFiles();
		ArrayList<File> traverseList = new ArrayList<>(Arrays.asList(rootFilesAndFolders));
		ArrayList<File> filesOnlyList = new ArrayList<>();
		while(!traverseList.isEmpty()) {
			// Clean the list from the files and pass them to the files only list
			for (int i = 0; i < traverseList.size(); i++) {
				if (traverseList.get(i).isFile()) {
					filesOnlyList.add(traverseList.get(i));
					traverseList.set(i, new File(""));
				}
			}
			while (traverseList.contains(new File(""))) {
				traverseList.remove(new File(""));
			}
			
			if (traverseList.size() == 0)
				break;
			File folderToRemove = traverseList.remove(0);
			File[] containedFilesAndFolders = folderToRemove.listFiles();
			traverseList.addAll(Arrays.asList(containedFilesAndFolders));
			
		}
		return filesOnlyList;
	}
}
