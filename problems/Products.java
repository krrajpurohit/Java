package problems;

public class Products {

	public int[] product(int[] array) {
		int product = 1;
		int[] productArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j != i) {
					product = product * array[j];
				}
			}
			productArray[i] = product;
			product = 1;
		}
		return productArray;

	}

	public static void main(String[] args) {

		Products test = new Products();
		int[] array = { 1, 2, 3, 4, 5 };

		int[] array1 = test.product(array);

		for (int k : array1) {
			System.out.println(k);
		}
	}
}
