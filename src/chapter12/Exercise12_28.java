package chapter12;

import java.io.File;

/**
 * @author Erlin Goce
 *
 * Mar 9, 2018 7:47:42 PM
 * 
 */
public class Exercise12_28 {
	public static void main(String[] args) {
		/** Same as Exercise12_27 save for a small detail*/
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("Exercise")) {
				String fileName = args[i];
				File file = new File(args[i]);
				String IAndJ = fileName.substring(8).split("\\.")[0];
				String I = IAndJ.split("_")[0];
				String J = IAndJ.split("_")[1];
				if (I.length() == 1)
					I = "0" + I;
				
				String newFileName = "Exercise" + I + "_" + J + ".java";
				file.renameTo(new File(newFileName));
			}
		}
	}
}
