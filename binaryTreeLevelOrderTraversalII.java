//Binary Tree Level Order Traversal II
//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//      3
//      / \
//          9  20
//          /  \
//              15   7
//              return its bottom-up level order traversal as:
//              [
//              [15,7],
//              [9,20],
//              [3]
//              ]
//              confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
//              OJ's Binary Tree Serialization:
//              The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
//              Here's an example:
//              1
//              / \
//                  2   3
//                  /
//                  4
//                  \
//                      5
//                      The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".

//solution 1
import java.util.ArrayList;
class binaryTreeLevelOrderTraversalII {
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
	static void dfs(TreeNode root, int level, ArrayList<ArrayList<Integer>> result) {
		if (root == null) {
			return;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (level >= result.size()) {
			list = new ArrayList<Integer>();
			result.add(0, list);
		}
		else {
			list = result.get(result.size() - level - 1);
		}
		list.add(root.value);
		dfs(root.left, level + 1, result);
		dfs(root.right, level + 1, result);
	}
	static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) {
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		dfs(root, 0, result);
		return result;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(4);
		p.left.right = new TreeNode(5);
		p.right = new TreeNode(3);
		p.right.left = new TreeNode(6);
		p.right.right = new TreeNode(7);
		System.out.println(levelOrderBottom(p));
	}
}
