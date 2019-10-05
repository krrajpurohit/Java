
public class FindMinInArray {

	public static void main(String args[]) {

		int[][] marks = {

				{ 1, 2, 3, 5 }, { 4, 5, 6, 3 }, { 7, 8, 95, 8 }, { 5, 7, 20, 56 }

		};

		int max = marks[0][0];
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[0].length; j++) {

				if (marks[i][j] > max)
					max = marks[i][j];

			}

		}
		System.out.println(max);

	}

}
