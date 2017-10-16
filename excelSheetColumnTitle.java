//Excel Sheet Column Title
//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//For example:
//1 -> A
//2 -> B
//3 -> C
//...
//26 -> Z
//27 -> AA
//28 -> AB
//Credits:
//Special thanks to @ifanchu for adding this problem and creating all test cases.

//solution 1
class excelSheetColumnTitle {
	static String convertToTitle(int n) {
		String s = "";
		while (n >= 1) {
			int r = n % 26;
			n = n / 26;
			if (r != 0) {
				s = s + (char)('A' + r - 1);
			}
			else {
				s = s + 'Z';
				n--;
			}
		}
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(convertToTitle(703));
	}
}
