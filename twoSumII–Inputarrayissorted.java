//Two Sum II 鈥� Input array is sorted
//Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one twoSumII–InputArrayIsSorted.
//Input: numbers={2, 7, 11, 15}, target=9
//Output: index1=1, index2=2

//solution 1
import java.util.Arrays;
class twoSumII–InputArrayIsSorted {
	static int[] twoSum(int[] numbers, int target) {
		if ((numbers == null) || (numbers.length == 1)) {
			return null;
		}
		int left = 0;
		int right = numbers.length - 1;
		while (left <= right - 1) {
			if (numbers[left] + numbers[right] <= target - 1) {
				left++;
				continue;
			}
			else if (numbers[left] + numbers[right] >= target + 1) {
				right--;
				continue;
			}
			else {
				break;
			}
		}
		int[] result = new int[2];
		result[0] = left + 1;
		result[1] = right + 1;
		return result;
	}
	public static void main(String[] args) {
		int[] a = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(a, 26)));
	}
}
