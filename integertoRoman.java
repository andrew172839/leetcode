//Integer to Roman
//Given an integer, convert it to a roman numeral.
//Input is guaranteed to be within the range from 1 to 3999.

//solution 1
class integerToRoman {
	static String intToRoman(int num) {
		int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int i = 0;
		String result = "";
		while (num > 0) {
			if (num >= numbers[i]) {
				num = num - numbers[i];
				result = result + romans[i];
			}
			else {
				i++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(intToRoman(432));
	}
}
