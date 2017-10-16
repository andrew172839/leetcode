//Divide Two Integers
//Divide two integers without using multiplication, division and mod operator.
//If it is overflow, return MAX_INT.

//solution 1
class divideTwoIntegers {
	static int divide(int dividend, int divisor) {
		if (dividend == 0) {
			return 0;
		}
		if (divisor == 0) {
			throw new ArithmeticException("inf");
		}
		boolean negative = false;
		if (dividend < 0) {
			dividend = Math.abs(dividend);
			negative = true;
		}
		if (divisor < 0) {
			divisor = Math.abs(divisor);
			if (negative == true) {
				negative = false;
			}
			else {
				negative = true;
			}
		}
		int result = 0;
		if (dividend < divisor) {
			result = 0;
		}
		int remain = dividend - divisor;
		while (remain >= 0) {
			result++;
			remain = remain - divisor;
		}
		if (negative == true) {
			return -result;
		}
		else {
			return result;
		}
	}
	public static void main(String[] args) {
		System.out.println(divide(2147483646, 2));
	}
}
