//Reverse Words in a String
//Given an input string, reverse the string word by word.
//For example,
//    Given s = "the sky is blue",
//    return "blue is sky the".
//    click to show clarification.
//    Clarification:
//    What constitutes a word?
//    A sequence of non-space characters constitutes a word.
//    Could the input string contain leading or trailing spaces?
//    Yes. However, your reversed string should not contain leading or trailing spaces.
//    How about multiple spaces between two words?
//    Reduce them to a single space in the reversed string.

//solution 1
class reverseWordsInAString {
	static String reverseWords(String s) {
		if (s == null) {
			return "";
		}
		String[] array = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals("") == false) {
				result.append(array[i]).append(" ");
			}
		}
		if (result.length() == 0) {
			return "";
		}
		else {
			return result.substring(0, result.length() - 1);
		}
	}
	public static void main(String[] args) {
		String s = "    the    sky   is   blue     ";
		System.out.println(reverseWords(s));
	}
}
