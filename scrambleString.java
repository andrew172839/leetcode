//Scramble String
//Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.鈥˙elow is one possible representation of s1 = 鈥済reat鈥�:
//great
///    \
//        gr    eat
//        / \    /  \
//            g   r  e   at
//            / \
//                a   t
//                To scramble the string, we may choose any non-leaf node and swap its two children.鈥‵or example, if we choose the node 鈥済r鈥� and swap its two children, it produces a scrambled string 鈥渞geat鈥�.
//                rgeat
//                /    \
//                    rg    eat
//                    / \    /  \
//                        r   g  e   at
//                        / \
//                            a   t
//                            We say that 鈥渞geat鈥� is a scrambled string of 鈥済reat鈥�.鈥⊿imilarly, if we continue to swap the children of nodes 鈥渆at鈥� and 鈥渁t鈥�, it produces a scrambled string 鈥渞gtae鈥�.
//                            rgtae
//                            /    \
//                                rg    tae
//                                / \    /  \
//                                    r   g  ta  e
//                                    / \
//                                        t   a
//                                        We say that 鈥渞gtae鈥� is a scrambled string of 鈥済reat鈥�.鈥℅iven two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.

//solution 1                                        
class scrambleString {
	static boolean isScramble(String s1, String s2) {
		if ((s1 == null) || (s1.length() == 0) || (s2 == null) || (s2.length() == 0)) {
			throw new IllegalArgumentException("");
		}
		if (s1.equals(s2)) {
			return true;
		}
		int length = s1.length();
		boolean[][][] dp = new boolean[length][length][length + 1];
		for (int i = 0; i <= length - 1; i++) {
			for (int j = 0; j <= length - 1; j++) {
				dp[i][j][1] = s1.charAt(i) == s2.charAt(j);
			}
		}
		for (int l = 2; l <= length; l++) {
			for (int i = 0; i <= length - l; i++) {
				for (int j = 0; j <= length - l; j++) {
					for (int p = 1; p <= l - 1; p++) {
						if ((dp[i][j][p] && dp[i + p][j + p][l - p]) || (dp[i][j + l - p][p] && dp[i + p][j][l - p])) {
							dp[i][j][l] = true;
							break;
						}
					}
				}
			}
		}
		return dp[0][0][len];
	}
	public static void main(String args[]) {
		String s1 = "great";
		String s2 = "rgtae";
		System.out.println(isScramble(s1, s2));
	}
}
