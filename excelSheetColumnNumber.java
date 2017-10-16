//Excel Sheet Column Number
//Related to question Excel Sheet Column Title
//Given a column title as appear in an Excel sheet, return its corresponding column number.
//For example:
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//Credits:
//Special thanks to @ts for adding this problem and creating all test cases.

//solution 1
class excelSheetColumnNumber {
	static int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		if (s.matches("^[A-Z]+$") == false) {
			return -1;
		}
		int result = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int digit = s.charAt(i) - 'A' + 1;
			result = result + (int)Math.pow(26, s.length() - 1 - i) * digit;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}
}
