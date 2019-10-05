
public class ArrayReversed {

	public void printReversed(int nums[]) {

		for (int i = ((nums.length) - 1); i >= 0; i--) {
			System.out.println(nums[i]);
		}
	}

	public int arrayMax(int numArray[]) {

		int max = numArray[0];

		for (int i = 1; i < (numArray.length); i++) {

			if (numArray[i] > max) {
				max = numArray[i];
			}

		}
		return max;

	}
}
