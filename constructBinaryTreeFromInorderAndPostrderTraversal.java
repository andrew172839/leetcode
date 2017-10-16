//Construct Binary Tree from Inorder and Postorder Traversal
//Given inorder and postorder traversal of a tree, construct the binary tree.
//Note:
//You may assume that duplicates do not exist in the tree.

//solution 1
class constructBinaryTreeFromInorderAndPostorderTraversal {
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
	static int findPosition(int[] inorder, int inStart, int inEnd, int value) {
		for (int key = inStart; key <= inEnd; key++) {
			if (inorder[key] == value) {
				return key;
			}
		}
		return -1;
	}
	static TreeNode dfs(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
		if (inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[postEnd]);
		int position = findPosition(inorder, inStart, inEnd, postorder[postEnd]);
		root.left = dfs(inorder, inStart, position - 1, postorder, postStart, postStart - inStart + position - 1);
		root.right = dfs(inorder, position + 1, inEnd, postorder, postStart - inStart + position, postEnd - 1);
		return root;
	}
	static TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length != postorder.length) {
			return null;
		}
		return dfs(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	}
	public static void main(String[] args) {
		int[] inorder = {4, 10, 3, 1, 7, 11, 8, 2};
		int[] postorder = {4, 1, 3, 10, 11, 8, 2, 7};
		TreeNode result = buildTree(inorder, postorder);
		System.out.println(result.value);
		System.out.println(result.left.value);
		System.out.println(result.left.left.value);
		System.out.println(result.left.right.value);
		System.out.println(result.right.value);
		System.out.println(result.right.left.value);
		System.out.println(result.right.left.left.value);
	}
}
