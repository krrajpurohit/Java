package hackerrank;

public class StringValidation {

	public boolean isStringValid(String input) {

		if (input.length() % 2 != 0) {
			return false;
		} else {
			for (int i = 0, j = input.length() - 1; i < (input.length()) / 2; i++, j--) {

				if ((int) (input.charAt(j)) - (int) (input.charAt(i)) != 2) {
					return false;
				}

			}
			return true;
		}

	}

	public static void main(String[] args) {

		String input = "<<[<]]>>";
		StringValidation validate = new StringValidation();
		System.out.println(validate.isStringValid(input));

	}

}
