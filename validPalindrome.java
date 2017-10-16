//Valid Palindrome
//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//For example,
//    "A man, a plan, a canal: Panama" is a palindrome.
//    "race a car" is not a palindrome.
//    Note:
//    Have you consider that the string might be empty? This is a good question to ask during an interview.
//    For the purpose of this problem, we define empty string as valid palindrome.

//solution 1
class validPalindrome {
	static boolean isPalindrome (String s) {
		if (s == null || s.length() == 1) {
			return true;
		}
		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			if (Character.isLetterOrDigit(s.charAt(l)) == false) {
				l++;
			}
			else if (Character.isLetterOrDigit(s.charAt(r)) == false) {
				r--;
			}
			else if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
				return false;
			}
			else {
				l++;
				r--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";
		//String s = "a";
		//String s = "ab";
		System.out.println(isPalindrome(s));
	}
}
