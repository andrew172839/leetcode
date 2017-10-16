//Convert Sorted Array to Binary Search Tree
//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

//solution 1
class convertSortedArrayToBinarySearchTree {
	static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			value = x;
			left = null;
			right = null;
		}
	}
	static TreeNode recursion(int[] number, int left, int right) {
		if (left > right) {
			return null;
		}
		int middle = left + (right - left) / 2;
		TreeNode node = new TreeNode(number[middle]);
		node.left = recursion(number, left, middle - 1);
		node.right = recursion(number, middle + 1, right);
		return node;
	}
	static TreeNode sortedArrayToBST(int[] num) {
		return recursion(num, 0, num.length - 1);
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		TreeNode node = sortedArrayToBST(a);
		System.out.println(node.value);
		System.out.println(node.left.value);
		System.out.println(node.right.value);
		System.out.println(node.left.right.value);
		System.out.println(node.right.right.value);
	}
}
