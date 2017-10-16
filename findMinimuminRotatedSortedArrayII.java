//Find Minimum in Rotated Sorted Array II
//Follow up for "Find Minimum in Rotated Sorted Array":
//What if duplicates are allowed?
//Would this affect the run-time complexity? How and why?
//Suppose a sorted array is rotated at some pivot unknown to you beforehand.
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//Find the minimum element.
//The array may contain duplicates.

//solution 1
class findMinimuminRotatedSortedArrayII {
	static int findMin(int[] num) {
		int left = 0;
		int right = num.length - 1;
		while (left < right) {
			int middle = left + (right - left) / 2;
			if (num[middle] < num[right]) {
				right = middle;
			}
			else if (num[middle] > num[right]) {
				left = middle + 1;
			}
			else {
				right--;
			}
		}
		return num[left];
	}
	public static void main(String[] args) {
		int[] a = {1, 1, -1, 1, 1};
		System.out.println(findMin(a));
	}
}
