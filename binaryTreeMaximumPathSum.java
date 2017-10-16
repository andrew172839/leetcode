//Binary Tree Maximum Path Sum
//Given a binary tree, find the maximum path sum.
//The path may start and end at any node in the tree.
//For example:
//Given the below binary tree,
//      1
//      / \
//          2   3
//          Return 6.

//solution 1
class binaryTreeMaximumPathSum {
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
	static int result;
	static int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = Math.max(dfs(node.left), 0);
		int right = Math.max(dfs(node.right), 0);
		result = Math.max(node.value + left + right, result);
		return node.value + Math.max(left, right);
	}
	static int maxPathSum(TreeNode root) {
		if (root == null) {
			throw new IllegalArgumentException("");
		}
		result = root.value;
		dfs(root);
		return result;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(-30);
		p.left.left = new TreeNode(4);
		p.left.right = new TreeNode(-7);
		System.out.println(maxPathSum(p));
	}
}
