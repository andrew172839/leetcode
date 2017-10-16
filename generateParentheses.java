//Generate Parentheses
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//For example, given n = 3, a solution set is:
//"((()))", "(()())", "(())()", "()(())", "()()()"

//solution 1
import java.util.ArrayList;
class generateParentheses {
	static void dfs(int left, int right, String s, ArrayList<String> result) {
		if (left == 0 && right == 0) {
			result.add(s);
			return;
		}
		if (left == 0) {
			dfs(left, right - 1, s + ")", result);
			return;
		}
		if (right == 0) {
			return;
		}
		if (left > right) {
			return;
		}
		dfs(left - 1, right, s + "(", result);
		dfs(left, right - 1, s + ")", result);
	}
	static ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
		dfs(n, n, "", result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}
}
