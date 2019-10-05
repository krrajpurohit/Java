
public class ArrayMaxCount {

	int count = 1;
	int maxIndex = 0;
	ArrayReversed a = new ArrayReversed();

	public int maxCount(int numArray[]) {

		int[] countArray = new int[numArray.length];

		for (int i = 0; i < (numArray.length); i++) {
			count = 1;
			for (int j = i + 1; j < (numArray.length); j++) {

				if (numArray[i] == numArray[j]) {
					count++;
				}

			}
			countArray[i] = count;

		}
		return a.arrayMax(countArray);

	}

	public static void main(String args[]) {

		ArrayMaxCount max = new ArrayMaxCount();
		int nums[] = { 1,1, 2, 2, 3, 3, 4, 7, 8, 8, 6, 4, 4, 4, 2, 3, 2, 5, 2, 1, 1, 7, 1, 1, 1, 1, 1 };

		System.out.println(max.maxCount(nums));

	}

}
