
public class BinarySearch {

	public int Search(int array[], int start, int end, int element) {
		int mid = 0;
		if (end >= start) {
			mid = (start + end) / 2;

			if (array[mid] == element) {
				return mid;
			}
			if (array[mid] > element) {
				return Search(array, start, mid - 1, element);
			}
			return Search(array, mid + 1, end, element);

		}

		return -1;
	}

	public static void main(String[] args) {
		BinarySearch test = new BinarySearch();
		int array[] = { 1, 5, 7, 8, 19, 65, 98, 998, 1000 };
		int result = test.Search(array, 0, (array.length - 1), 65);
		System.out.println("ELEMENT IS AT INDEX = " + result);
	}

}
