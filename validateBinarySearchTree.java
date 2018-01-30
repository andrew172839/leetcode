//Validate Binary Search Tree
//Given a binary tree, determine if it is a valid binary search tree (BST).
//Assume a BST is defined as follows:
//鈥�   The left subtree of a node contains only nodes with keys聽less than聽the node's key.
//鈥�   The right subtree of a node contains only nodes with keys聽greater than聽the node's key.
//鈥�   Both the left and right subtrees must also be binary search trees.

//solution 1
class validateBinarySearchTree {
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
	static boolean DFS(TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		return (root.value > min) && (root.value < max) && DFS(root.left, min, root.value) && DFS(root.right, root.value, max);
	}
	static boolean isValid(TreeNode root) {
		return DFS(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(4);
		p.left = new TreeNode(1);
		p.right = new TreeNode(5);
		System.out.println(isValid(p));
	}
}

//solution 2
class validateBinarySearchTree {
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
	static int previous = Integer.MIN_VALUE;
	static boolean isValidBst(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (isValidBst(root.left) == false) {
			return false;
		}
		if (root.value <= previous) {
			return false;
		}
		previous = root.value;
		if (isValidBst(root.right) == false) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(22);
		p.left = new TreeNode(11);
		p.right = new TreeNode(23);
		System.out.println(isValidBst(p));
	}
}
