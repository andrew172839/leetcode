//Implement strStr()
//    Implement strStr().
//    Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//    Update (2014-11-02):
//        The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button to reset your code definition.

//solution 1
class implementStrStr {
	static int strStr(String haystack, String needle) {
		if (haystack == null || haystack.length() == 0 || needle == null || needle.length() == 0 || haystack.length() < needle.length()) {
			return -1;
		}
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			boolean flag = true;
			for (int j = 0; j <= needle.length() - 1; j++) {
				if (haystack.charAt(i + j) == needle.charAt(j)) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(strStr("abcde", "de"));
	}
}

//solution 2
class implementStrStr {
	static int strStr(String haystack, String needle) {
		if (haystack == null || haystack.length() == 0 || needle == null || needle.length() == 0 || haystack.length() < needle.length()) {
			return -1;
		}
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			int j = 0;
			while (j <= needle.length() - 1) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
				j++;
			}
			if (j == needle.length()) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(strStr("abcde", "abc"));
	}
}
