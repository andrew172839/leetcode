//Majority Element
//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.
//Credits:
//Special thanks to @ts for adding this problem and creating all test cases.

//solution 1
import java.util.HashMap;
class majorityElement {
	static int majorityElement(int[] num) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i <= num.length - 1; i++) {
			if (hashmap.containsKey(num[i]) == false) {
				hashmap.put(num[i], 1);
			}
			else {
				hashmap.put(num[i], hashmap.get(num[i]) + 1);
			}
		}
		for (int item: hashmap.keySet()) {
			if (hashmap.get(item) > num.length / 2) {
				return item;
			}
		}
		return -1;
	}
	static void main(String[] args) {
		int[] a = {1, 2, 4, 3, 15};
		System.out.println(majorityElement(a));
	}
}

//solution 2
import java.util.Arrays;
class majorityElement {
	static int majorityElement(int[] num) {
		Arrays.sort(num);
		return num[num.length / 2];
	}
	public static void main(String[] args) {
		int[] a = {3, 3, 1, 2, 3, 3};
		System.out.println(majorityElement(a));
	}
}
