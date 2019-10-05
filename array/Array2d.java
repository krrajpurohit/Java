
public class Array2d {

	public static void main(String args[]) {

		int sum = 0;

		int[][] marks = {

				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks.length; j++) {

				sum += marks[i][j];

			}

		}
		System.out.println(sum);
	}
}
