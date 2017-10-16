//Letter Combinations of a Phone Number

//solution 1
import java.util.ArrayList;
import java.util.HashMap;
class letterCombinationsOfAPhoneNumber {
	static void dfs(String digits, HashMap<Character, char[]> map, StringBuilder sb, ArrayList<String> result) {
		if (sb.length() == digits.length()) {
			result.add(sb.toString());
			return;
		}
		for (char c: map.get(digits.charAt(sb.length()))) {
			sb.append(c);
			dfs(digits, map, sb, result);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
	static ArrayList<String> letterCombinations(String digits) {
		HashMap<Character, char[]> map = new HashMap<Character, char[]>();
		map.put('0', new char[] {});
		map.put('1', new char[] {});
		map.put('2', new char[] {'a', 'b', 'c'});
		map.put('3', new char[] {'d', 'e', 'f'});
		map.put('4', new char[] {'g', 'h', 'i'});
		map.put('5', new char[] {'j', 'k', 'l'});
		map.put('6', new char[] {'m', 'n', 'o'});
		map.put('7', new char[] {'p', 'q', 'r', 's'});
		map.put('8', new char[] {'t', 'u', 'v'});
		map.put('9', new char[] {'w', 'x', 'y', 'z'});
		StringBuilder sb = new StringBuilder();
		ArrayList<String> result = new ArrayList<String>();
		dfs(digits, map, sb, result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
}
