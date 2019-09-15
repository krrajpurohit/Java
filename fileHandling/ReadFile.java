package fileHandling;

import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static LinkedList<String> readFile(String filePath) {

		LinkedList<String> list = new LinkedList<String>();
		File file = new File(filePath);

		try {
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				list.add(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.err.println("FILE NOT FOUND");
		}

		return list;

	}

}
