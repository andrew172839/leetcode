//Find Minimum in Rotated Sorted Array
//Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//Find the minimum element.
//You may assume no duplicate exists in the array.

//solution 1
class findMinimuminRotatedSortedArray {
	static int findMin(int[] num) {
		int left = 0;
		int right = num.length - 1;
		while (left < right) {
			int middle = left + (right - left) / 2;
			if (num[middle] < num[right]) {
				right = middle;
			}
			else {
				left = middle + 1;
			}
		}
		return num[left];
	}
	public static void main(String[] args) {
		int[] a = {7, -3, 1, 2, 3, 5, 6};
		System.out.println(findMin(a));
	}
}
