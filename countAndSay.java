//Count and Say
//The count-and-say sequence is the sequence of integers beginning as follows:
//1, 11, 21, 1211, 111221, ...
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth sequence.
//Note: The sequence of integers will be represented as a string.

//solution 1
class countAndSay {
	static String countAndSay(int n) {
		if (n <= 0) {
			return null;
		}
		String result = "1";
		while (n >= 2) {
			StringBuilder builder = new StringBuilder();
			int count = 1;
			for (int i = 0; i <= result.length() - 2; i++) {
				if (result.charAt(i) == result.charAt(i + 1)) {
					count++;
				}
				else {
					builder.append(count);
					builder.append(result.charAt(i));
					count = 1;
				}
			}
			builder.append(count);
			builder.append(result.charAt(result.length() - 1));
			result = builder.toString();
			n--;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
}
