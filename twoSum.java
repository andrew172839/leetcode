//Two Sum
//Given an array of integers, find two numbers such that they add up to a specific target number.
//The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution.
//Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2

//solution 1
import java.util.Arrays;
class twoSum {
	static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 1) {
			return null;
		}
		int[] sorted = new int[numbers.length];
		System.arraycopy(numbers, 0, sorted, 0, numbers.length);
		Arrays.sort(sorted);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			if (sorted[left] + sorted[right] < target) {
				left++;
				continue;
			}
			else if (sorted[left] + sorted[right] > target) {
				right--;
				continue;
			}
			else {
				break;
			}
		}
		int index1 = -1;
		int index2 = -1;
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (numbers[i] == sorted[left] || numbers[i] == sorted[right]) {
				if (index1 == -1) {
					index1 = i + 1;
				}
				else {
					index2 = i + 1;
				}
			}
		}
		int[] result = new int[2];
		result[0] = index1;
		result[1] = index2;
		return result;
	}
	public static void main(String[] args) {
		int[] a = {7, 11, 15, 2};
		System.out.println(Arrays.toString(twoSum(a, 9)));
	}
}

//solution 2
import java.util.Arrays;
import java.util.HashMap;
class twoSum {
	static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 1) {
			return null;
		}
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i <= numbers.length - 1; i++) {
			if (hash.containsKey(numbers[i]) == false) {
				hash.put(target - numbers[i], i);
			}
			else {
				result[0] = hash.get(numbers[i]) + 1;
				result[1] = i + 1;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {7, 11, 15, 2};
		System.out.println(Arrays.toString(twoSum(a, 9)));
	}
}

//solution 3
import java.util.ArrayList;
import java.util.Arrays;
public class twoSum {
	static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 1) {
			return null;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= numbers.length - 1; i++) {
			list.add(numbers[i]);
		}
		int[] result = new int[2];
		for (int i = 0; i <= list.size() - 1; i++) {
			if (list.contains(target - list.get(i))) {
				if (list.indexOf(target - list.get(i)) == i) {
					continue;
				}
				else {
					result[0] = i;
					result[1] = list.indexOf(target - list.get(i));
					break;
				}
			}
		}
		return result;
	}
	static void main(String[] args) {
		int[] a = {1, 2, -3, 4, -5};
		System.out.println(Arrays.toString(twoSum(a, 6)));
	}
}
