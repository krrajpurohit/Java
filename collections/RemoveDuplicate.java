
import java.util.*;

public class RemoveDuplicate {

	LinkedHashSet<String> myLhashSet = new LinkedHashSet<String>();

	public String[] spiltArrayBySpace(String inputString) {

		String inputArray[] = inputString.split(" ");
		return inputArray;
	}

	public void getUniqueString(String inputString) {
		String inputArray[] = spiltArrayBySpace(inputString);

		for (int i = 0; i < inputArray.length; i++) {
			myLhashSet.add(inputArray[i]);
		}

		Object array[] = myLhashSet.toArray();

		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String args[]) {
		RemoveDuplicate test = new RemoveDuplicate();

		test.getUniqueString("INDIA IS IS MY MY COUNTRY COUNTRY IS MY INDIA");
	}

}
