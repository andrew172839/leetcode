//Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.

//solution 1
class longestCommonPrefix {
	static String longestCommonPrefix(String[] strs) {
		if (strs == null) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		for (int i = 0; i <= strs[0].length() - 1; i++) {
			for (int j = 1; j <= strs.length - 1; j++) {
				if (strs[0].charAt(i) != strs[j].charAt(i) || i >= strs[j].length()) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}
	public static void main(String[] args) {
		String[] s = {"abc", "abbbbb", "abdee"};
		System.out.println(longestCommonPrefix(s));
	}
}
