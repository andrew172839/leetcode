//Roman To Integer
//Given a roman numeral, convert it to an integer.
//Input is guaranteed to be within the range from 1 to 3999.

//solution 1
class romanToInteger {
	static int romanToInt(String s) {
		char[] roman = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int[] number = {1000, 500, 100, 50, 10, 5, 1};
		int result = 0;
		int last = 0;
		for (int i = 0; i <= s.length() - 1; i++)
			for (int j = 0; j <= roman.length - 1; j++) {
				if (s.charAt(i) == roman[j]) {
					result = result + number[j];
					if (j < last) {
						result = result - 2 * number[last];
					}
					last = j;
				}
			}
		return result;
	}
	public static void main(String[] args) {
		String s = "CVD";
		System.out.println(romanToInt(s));
	}
}
