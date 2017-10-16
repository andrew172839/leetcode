//ZigZag Conversion
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

//solution 1
class zigzagConversion {
	static String convert(String s, int nRows) {
		if (s == null || nRows <= 0) {
			return null;
		}
		if (nRows == 1) {
			return s;
		}
		StringBuilder result = new StringBuilder();
		int size = 2 * nRows - 2;
		for (int i = 0; i <= nRows - 1; i++)
			for (int j = i; j <= s.length() - 1; j = j + size) {
				result.append(s.charAt(j));
				if (i != 0 && i != nRows - 1) {
					if (j - 2 * i + size <= s.length() - 1) {
						result.append(s.charAt(j - 2 * i + size));
					}
				}
			}
		return result.toString();
	}
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 3));
	}
}
