
public class TransposeNcopy {

	public static void main(String args[]) {

		int[][] marks1 = {

				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		int[][] marks2 = new int[3][3];

		for (int i = 0; i < marks1.length; i++) {
			for (int j = 0; j < marks1.length; j++) {

				marks2[j][i] = marks1[i][j];

			}

		}

		for (int i = 0; i < marks2.length; i++) {
			for (int j = 0; j < marks2.length; j++) {

				System.out.print(marks2[i][j] + "|");

			}
			System.out.println(" ");

		}

	}

}
