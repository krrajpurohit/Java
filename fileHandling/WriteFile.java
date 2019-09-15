package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class WriteFile {

	public static void fileWriting(String filePath, LinkedList<String> list) {

		File file = new File(filePath);

		try {
			FileWriter filewrite = new FileWriter(file, true);
			PrintWriter printer = new PrintWriter(filewrite);
			for (String line : list) {
				printer.println(line);
			}
			printer.close();
			filewrite.close();
		} catch (IOException e) {
			System.err.println("ERROR OCCURED WHILE WRITING");
		}

	}

}
