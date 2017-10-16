//Length of Last Word
//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//If the last word does not exist, return 0.
//Note: A word is defined as a character sequence consists of non-space characters only.

//solution 1
class lengthOfLastWord {
	static int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		int result = 0;
		boolean flag = true;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && flag == true) {
				continue;
			}
			else if (s.charAt(i) != ' ') {
				flag = false;
				result++;
			}
			else {
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "Hello world";
		System.out.println(lengthOfLastWord(s));
	}
}

//solution 2
class lengthOfLastWord {
	static int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException();
		}
		String[] strings = s.split(" ");
		return strings[strings.length - 1].length();
	}
	public static void main(String[] args) {
		String s = "Hello world";
		System.out.println(lengthOfLastWord(s));
	}
}
