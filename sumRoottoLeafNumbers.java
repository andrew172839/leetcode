//Sum Root to Leaf Numbers
//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//Find the total sum of all root-to-leaf numbers.
//For example,
//    1
//    / \
//	    2   3
//	    The root-to-leaf path 1->2 represents the number 12.
//	    The root-to-leaf path 1->3 represents the number 13.
//	    Return the sum = 12 + 13 = 25.

//solution 1
class sumRootToLeafNumbers {
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
	static int dfs(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		sum = sum * 10 + root.value;
		if (root.left == null && root.right == null) {
			return sum;
		}
		return dfs(root.left, sum) + dfs(root.right, sum);
	}
	static int sumNumbers(TreeNode root) {
		return dfs(root, 0);
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(4);
		p.right = new TreeNode(3);
		p.right.right = new TreeNode(5);
		System.out.println(sumNumbers(p));
	}
}
