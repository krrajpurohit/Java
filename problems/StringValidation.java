
import java.util.Stack;

public class StringValidation {

	Stack<Character> myStack = new Stack<Character>();

	public boolean isStringValid(String input) {

		if (input.length() % 2 != 0 || input.charAt(0) == '>' || input.charAt(0) == ']') {
			return false;
		} else {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '<' || input.charAt(i) == '[') {
					myStack.push(input.charAt(i));
				} else {
					if (input.charAt(i) == '>' && myStack.peek() == '<'
							|| input.charAt(i) == ']' && myStack.peek() == '[') {
						myStack.pop();
					} else {
						myStack.push(input.charAt(i));
					}
				}
			}
			return myStack.empty();
		}
	}

	public static void main(String[] args) {

		String input = "><[]<>";
		StringValidation test = new StringValidation();
		System.out.println(test.isStringValid(input));

	}

}
