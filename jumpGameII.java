//Jump Game II
//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//Each element in the array represents your maximum jump length at that position.
//Your goal is to reach the last index in the minimum number of jumps.
//For example:
//    Given array A = [2,3,1,1,4]
//The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

//solution 1    
class jumpGameII {
	static int jump(int[] A) {
		int next = 0;
		int current = 0;
		int result = 0;
		for (int i = 0; i <= A.length - 1; i++) {
			if (i >= current - 1) {
				current = next;
				step++;
			}
			next = Math.max(next, i + A[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 1, 1, 5};
		System.out.println(jump(array));
	}
}
