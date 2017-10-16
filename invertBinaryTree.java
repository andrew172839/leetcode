//Invert Binary Tree

//solution 1
class invertBinaryTree {
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
	static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			throw new IllegalArgumentException("");
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.right = invertTree(left);
		root.left = invertTree(right);
		return root;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		TreeNode q = invertTree(p);
		System.out.println(q.value);
		System.out.println(q.left.value);
		System.out.println(q.right.value);
	}
}
