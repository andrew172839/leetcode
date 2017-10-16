//Binary Tree Inorder Traversal
//Given a binary tree, return the inorder traversal of its nodes' values.
//For example:
//Given binary tree {1,#,2,3},
//      1
//      \
//          2
//          /
//          3
//          return [1,3,2].
//          Note: Recursive solution is trivial, could you do it iteratively?

//solution 1
import java.util.ArrayList;
class binaryTreeInorderTraversal {
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
	static ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		if (root.left != null) {
			result.addAll(inorderTraversal(root.left));
		}
		result.add(root.value);
		if (root.right != null) {
			result.addAll(inorderTraversal(root.right));
		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.right = new TreeNode(4);
		p.right = new TreeNode(5);
		p.right.right = new TreeNode(6);
		System.out.println(inorderTraversal(p));
	}
}
