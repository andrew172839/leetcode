//Binary Tree Preorder Traversal
//Given a binary tree, return the preorder traversal of its nodes' values.
//For example:
//Given binary tree {1,#,2,3},
//      1
//      \
//	      2
//	      /
//	      3
//	      return [1,2,3].
//	      Note: Recursive solution is trivial, could you do it iteratively?

//solution 1 
import java.util.ArrayList;
class binaryTreePreorderTraversal {
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
	static void dfs(TreeNode root, ArrayList<Integer> result) {
		if (root == null) {
			return;
		}
		else {
			result.add(root.value);
			dfs(root.left, result);
			dfs(root.right, result);
		}
	}
	static ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			throw new IllegalArgumentException("");
		}
		else {
			dfs(root, result);
		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.right = new TreeNode(4);
		p.right = new TreeNode(5);
		p.right.left = new TreeNode(6);
		p.right.right = new TreeNode(7);
		System.out.println(preorderTraversal(p));
	}
}
