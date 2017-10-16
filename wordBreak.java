//Word Break
//Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
//For example, given
//s = "leetcode",
//  dict = ["leet", "code"].
//  Return true because "leetcode" can be segmented as "leet code".

//solution 1
import java.util.HashSet;
import java.util.Set;
class wordBreak {
	static boolean wordBreak(String s, Set<String> dict) {
		boolean result = false;
		for (int i = 1; i <= s.length(); i++) {
			if (dict.contains(s.substring(0, i))) {
				if (i == s.length()) {
					return true;
				}
				result = wordBreak(s.substring(i), dict);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "lesetcode";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		dict.add("s");
		System.out.println(wordBreak(s, dict));
	}
}

//solution 2
import java.util.HashSet;
import java.util.Set;
class wordBreak {
	static boolean wordBreak(String s, Set<String> dict) {
		boolean result = false;
		for (int i = 1; i <= s.length(); i++) {
			if (dict.contains(s.substring(0, i))) {
				if (i == s.length()) {
					return true;
				}
				result = wordBreak(s.substring(i), dict);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "lesetcode";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		dict.add("s");
		System.out.println(wordBreak(s, dict));
	}
}
