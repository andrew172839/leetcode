//Maximum Depth of Binary Tree
//Given a binary tree, find its maximum depth.
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

//solution 1
class maximumDepthOfBinaryTree {
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
	static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		if (root.left != null && root.right == null) {
			return maxDepth(root.left) + 1;
		}
		if (root.left == null && root.right != null) {
			return maxDepth(root.right) + 1;
		}
		if (root.left != null && root.right != null) {
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		p.left.left = new TreeNode(4);
		p.left.right = new TreeNode(5);
		p.right.left = new TreeNode(6);
		p.right.right = new TreeNode(7);
		System.out.println(maxDepth(p));
	}
}
