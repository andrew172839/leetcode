//Distinct Subsequences
//Given a string S and a string T, count the number of distinct subsequences of T in S.
//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE"while "AEC" is not).
//Here is an example:
//S = "rabbbit", T = "rabbit"
//Return 3.

//solution 1
class distinctSubsequences {
	static int distinctNumber(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		dp[0][0] = 1;
		for (int i = 1; i <= s.length(); i++) {
			dp[i][0] = 1;
		}
		for (int j = 1; j <= t.length(); j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				dp[i][j] = dp[i - 1][j];
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i][j] + dp[i - 1][j - 1];
				}
			}
		}
		return dp[s.length()][t.length()];
	}
	public static void main(String[] args) {
		String s1 = "abbbc";
		String s2 = "abc";
		System.out.println(distinctNumber(s1, s2));
	}
}
