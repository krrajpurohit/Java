package fileHandling;

import java.util.LinkedList;

public class FileIO {

	public static void main(String[] args) {

		LinkedList<String> list = ReadFile.readFile("/home/kuldeep/Desktop/test.txt");
		WriteFile.fileWriting("/home/kuldeep/Desktop/output.txt", list);

	}

}
