//Evaluate Reverse Polish Notation
//Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//Valid operators are +, -, *, /. Each operand may be an integer or another expression.
//Some examples:
//["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

//solution 1
import java.util.Stack;
class evaluateReversePolishNotation {
	static int ERPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i <= tokens.length - 1; i++) {
			if (tokens[i].equals("+")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b + a);
			}
			else if (tokens[i].equals("-")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b - a);
			}
			else if (tokens[i].equals("*")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b * a);
			}
			else if (tokens[i].equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b / a);
			}
			else {
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		return stack.pop();
	}
	public static void main(String[] args) {
		String[] s = {"4", "13", "5", "/", "+"};
		System.out.println(ERPN(s));
	}
}
