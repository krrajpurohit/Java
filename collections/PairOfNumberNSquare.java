
import java.util.*;

public class PairOfNumberNSquare {
	HashSet<Integer> squarePair = new HashSet<Integer>();

	public void getSquarePair(Integer[] numArray) {

		for (int i = 0; i < numArray.length; i++) {
			squarePair.add(numArray[i]);

		}
		Iterator values = squarePair.iterator();
		while (values.hasNext()) {
			Integer num = Integer.valueOf(values.next().toString());
			Integer square = num * num;
			if (squarePair.contains(square)) {
				System.out.println(num + " = " + square);
			}
		}

	}

	public static void main(String args[]) {
		PairOfNumberNSquare test = new PairOfNumberNSquare();
		Integer[] data = { 11, 12, 13, 22, 11, 22, 24, 23, 35, 100, 200, 20, 121, 10, 1225 };
		test.getSquarePair(data);

	}

}
