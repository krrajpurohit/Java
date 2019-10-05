
public class DoubleArray {

	public static void main(String args[]) {

		String[] name = { "rutuj", "kuldeep", "ankush" };

		double[][] marks = { { 89.5, 87.5, 43.7 }, { 22.6, 89.9, 97.8 }, { 67.8, 67.9, 34.7 } };

		double[][] markWithAvg = new double[3][4];

		for (int i = 0; i < marks.length; i++) {
			double sum = 0;
			for (int j = 0; j < markWithAvg[0].length; j++) {
				if (j == 3) {
					markWithAvg[i][j] = sum / (markWithAvg[0].length - 1);
				} else {
					markWithAvg[i][j] = marks[i][j];
					sum += marks[i][j];
				}

			}

		}

		System.out.println("PHY  CHEM  MATHS  AVG");

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < markWithAvg[0].length; j++) {

				System.out.print(markWithAvg[i][j] + "  ");

			}
			System.out.println(" ");
		}

		double max = markWithAvg[0][3];
		int maxIndex=0;
		for (int i = 0, j = 3; i < marks.length; i++) {

			if (max < markWithAvg[i][j]) {
				max = markWithAvg[i][j];
				maxIndex=i;
			}

		}

		System.out.println(name[maxIndex]);
		
	}

}

/*
 * public void computeResult(double[][] inputMarks, double[][] result) { for(int
 * i=0; i<inputMarks.length; i++) { double sum = 0; for(int j=0;
 * j<inputMarks[0].length; j++) { result[i][j] = inputMarks[i][j]; sum = sum +
 * inputMarks[i][j]; } for(int k=result[0].length-1; k < result[0].length; k++)
 * { result[i][k] = sum/inputMarks[0].length; } } }/
 */
