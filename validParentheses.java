//Valid Parentheses
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

//solution 1
import java.util.Stack;
class validParentheses {
	static boolean isValid(String s) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		Stack<Character> left = new Stack<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == ')') {
				if (left.empty() == true || left.pop() != '(') {
					return false;
				}
			}
			else if (c == ']') {
				if (left.empty() == true || left.pop() != '[') {
					return false;
				}
			}
			else if (c == '}') {
				if (left.empty() == true || left.pop() != '{') {
					return false;
				}
				}
			else {
				left.push(c);
			}
			}
		return left.empty();
	}
	public static void main(String args[]) {
		String s = "{[]}";
		System.out.println(isValid(s));
	}
}
