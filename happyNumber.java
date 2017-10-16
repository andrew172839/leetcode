//Happy Number
//Write an algorithm to determine if a number is "happy".
//A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//Example: 19 is a happy number
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

//solution 1
import java.util.ArrayList;
class happyNumber {
	static int next(int n) {
		int result = 0;
		while (n != 0) {
			result = result + (n % 10) * (n % 10);
			n = n / 10;
		}
		return result;
	}
	static boolean isHappy(int n) {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		while (n != 1) {
			if (integers.contains(n)) {
				return false;
			}
			else {
				integers.add(n);
				n = next(n);
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
