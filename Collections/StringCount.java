package collectionsExample;

import java.util.*;

public class StringCount {

	String inputArray[];

	HashMap<String, Integer> myHash = new HashMap<String, Integer>();

	public void spiltArrayBySpace(String inputString) {

		inputArray = inputString.split(" ");

	}

	public void addToArray() {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (myHash.containsKey(inputArray[i])) {

				count = myHash.get(inputArray[i]);
				myHash.put(inputArray[i], ++count);

			} else {
				myHash.put(inputArray[i], 1);
			}
		}

	}

	public void printHashMap() {

		Set Keys = myHash.keySet();
		Iterator iterator = Keys.iterator();

		String maxCountString = "null";
		int maxCount = 0;

		while (iterator.hasNext()) {

			String inputString = iterator.next().toString();
			int count = myHash.get(inputString);

			if (maxCount < count) {
				maxCountString = inputString;
				maxCount = count;
			}

			System.out.println("String= " + inputString + " count= " + count);

		}
		System.out.println("MaxString= " + maxCountString + " maxCount= " + maxCount);

	}

	public static void main(String args[]) {
		String inputString = "THIS IS THIS IS TEST TEST TEST STRING";
		StringCount stringcount = new StringCount();

		stringcount.spiltArrayBySpace(inputString);
		stringcount.addToArray();
		stringcount.printHashMap();

	}

}
