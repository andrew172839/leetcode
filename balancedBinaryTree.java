//Balanced Binary Tree
//Given a binary tree, determine if it is height-balanced.
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of everynode never differ by more than 1.

//solution 1
class balancedBinaryTree {
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
	static int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		else {
			return Math.max(height(root.left), height(root.right)) + 1;
		}
	}
	static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return 0;
		}
		else {
			return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
		}
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(1);
		p.right = new TreeNode(1);
		p.right.right = new TreeNode(1);
		p.right.right.right = new TreeNode(1);
		p.left.left = new TreeNode(1);
		System.out.println(isBalanced(p));
	}
}
