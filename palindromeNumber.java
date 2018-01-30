//Palindrome Number
//Determine whether an integer is a palindrome. Do this without extra space.
//Some hints:
//Could negative integers be palindromes? (ie, -1)
//    If you are thinking of converting the integer to string, note the restriction of using extra space.
//    You could also try reversing an integer. However, if you have solved the problem 鈥淩everse Integer鈥�,
//    you know that the reversed integer might overflow. How would you handle such case?
//    There is a more generic way of solving this problem.

//solution 1    
class palindromeNumber {
	static boolean isP(int x) {
		if (x == 0) {
			return true;
		}
		if ((x < 0) || ((x / 10) == 0)) {
			return false;
		}
		int xSave = x;
		int y = 0;
		while (x > 0) {
			y = y * 10 + x % 10;
			x = x / 10;
		}
		return xSave == y;
	}
	public static void main(String[] args) {
		System.out.println(isP(1234554322));
	}
}
