//Find Peak Element
//A peak element is an element that is greater than its neighbors.
//Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//You may imagine that num[-1] = num[n] = -∞.
//For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
//click to show spoilers.
//Note:
//Your solution should be in logarithmic complexity.
//Credits:
//Special thanks to @ts for adding this problem and creating all test cases.

//solution 1
class findPeakElement {
	static int findPeakElement(int[] num) {
		if (num == null || num.length == 0) {
			return -1;
		}
		if (num.length == 1) {
			return 0;
		}
		if (num[0] > num[1]) {
			return 0;
		}
		if (num[num.length - 1] > num[num.length - 2]) {
			return num.length - 1;
		}
		int left = 0;
		int right = num.length - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (num[middle - 1] < num[middle] && num[middle] > num[middle + 1]) {
				return middle;
			}
			else if (num[middle - 1] > num[middle]) {
				right = middle - 1;
			}
			else if (num[middle] < num[middle + 1]) {
				left = middle + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {2, 3, -1, 1, 3, 2, 3, 2};
		System.out.println(findPeakElement(a));
	}
}
