//Permutations II
//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//For example,
//    [1,1,2] have the following unique permutations:
//    [1,1,2], [1,2,1], and [2,1,1].

//solution 1
import java.util.ArrayList;
class permutationsII {
	static void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
	static void reverse(int[] num, int i, int j) {
		while (i < j) {
			swap(num, i, j);
			i++;
			j--;
		}
	}
	static boolean nextPermute(int[] num) {
		if (num.length == 1) {
			return false;
		}
		int i = num.length - 2;
		while (true) {
			if (num[i] < num[i + 1]) {
				int j = num.length -1;
				while (num[i] >= num[j]) {
					j--;
				}
				swap(num, i, j);
				reverse(num, i + 1, num.length - 1);
				return true;
			}
			if (i == 0) {
				return false;
			}
			i--;
		}
	}
	static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		if (num == null || num.length == 0) {
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		do {
			ArrayList<Integer> sequence = new ArrayList<Integer>();
			for (int i = 0; i <= num.length - 1; i++) {
				sequence.add(num[i]);
			}
			result.add(sequence);
		} while (nextPermute(num) == true);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 2};
		System.out.println(permuteUnique(a));
	}
}

//solution 2
import java.util.ArrayList;
class permutationsII {
	static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	static void dfs(int[] l, int[] r) {
		if (r.length <= 1) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i <= l.length - 1; i++) {
				list.add(l[i]);
			}
			for (int i = 0; i <= r.length - 1; i++) {
				list.add(r[i]);
			}
			if (result.contains(list) == false) {
				result.add(list);
			}
		}
		else {
			for (int i = 0; i <= r.length - 1; i++) {
				int[] newL = new int[l.length + 1];
				int[] newR = new int[r.length - 1];
				for (int j = 0; j <= newL.length - 1; j++) {
					if (j <= newL.length - 2) {
						newL[j] = l[j];
					}
					else {
						newL[j] = r[i];
					}
				}
				for (int j = 0; j <= newR.length - 1; j++) {
					if (j <= i - 1) {
						newR[j] = r[j];
					}
					else {
						newR[j] = r[j + 1];
					}
				}
				dfs(newL, newR);
			}
		}
	}
	static ArrayList<ArrayList<Integer>> permuteUnqiue(int[] num) {
		if (num == null || num.length == 0) {
			return null;
		}
		int[] initial = {};
		dfs(initial, num);
		return result;
	}
	public static void main(String[] args) {
		int[] a = {1, 1, 2};
		System.out.println(permuteUnqiue(a));
	}
}
