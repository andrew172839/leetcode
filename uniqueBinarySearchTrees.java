//Unique Binary Search Trees
//Given n, how many structurally unique BST’s (binary search trees) that store values 1…n?
//For example, Given n = 3, there are a total of 5 unique BST’s.
//1         3     3      2      1
//\       /     /      / \      \
//		3     2     1      1   3      2
//		/     /       \                 \
//			2     1         2                 3

//solution 1
class uniqueBinarySearchTrees {
	static int numBST(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + numBST(i - 1) * numBST(n - i);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(numBST(3));
	}
}

//solution 2
class uniqueBinarySearchTrees {
	static int numBST(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result = result * 2 * (2 * i - 1) / (i + 1);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(numBST(-1));
	}
}
