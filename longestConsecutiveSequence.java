//Longest Consecutive Sequence
//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//For example,
//    Given [100, 4, 200, 1, 3, 2],
//    The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
//    Your algorithm should run in O(n) complexity.

//solution 1
import java.util.HashSet;
class longestConsecutiveSequence {
	static int longestConsecutive(int[] num) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int number: num) {
			set.add(number);
		}
		int max = 0;
		for (int item: num) {
			int count = 1;
			int i = item - 1;
			while (set.contains(i)) {
				set.remove(i);
				count++;
				i--;
			}
			int j = item + 1;
			while (set.contains(j)) {
				set.remove(j);
				count++;
				j++;
			}
			max = Math.max(count, max);
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {100, 4, 200, 1, 3, 2, 5};
		System.out.println(longestConsecutive(a));
	}
}
