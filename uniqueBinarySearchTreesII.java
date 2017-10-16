//Unique Binary Search Trees II
//Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
//For example,
//    Given n = 3, your program should return all 5 unique BST's shown below.
//    1         3     3      2      1
//    \       /     /      / \      \
//        3     2     1      1   3      2
//        /     /       \                 \
//            2     1         2                 3
//            confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
//            OJ's Binary Tree Serialization:
//            The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
//            Here's an example:
//            1
//            / \
//                2   3
//                /
//                4
//                \
//                    5
//                    The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".

//solution 1
import java.util.ArrayList;
class uniqueBinarySearchTreesII {
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
	static ArrayList<TreeNode> dfs(int min, int max) {
		ArrayList<TreeNode> result = new ArrayList<TreeNode>();
		if (min > max) {
			result.add(null);
			return result;
		}
		for (int root = min; root <= max; root++) {
			ArrayList<TreeNode> left = dfs(min, root - 1);
			ArrayList<TreeNode> right = dfs(root + 1, max);
			for (int i = 0; i <= left.size() - 1; i++)
				for (int j = 0; j <= right.size() - 1; j++) {
					TreeNode rootNode = new TreeNode(root);
					rootNode.left = left.get(i);
					rootNode.right = right.get(j);
					result.add(rootNode);
				}
		}
		return result;
	}
	static ArrayList<TreeNode> generateTrees(int n) {
		return dfs(1, n);
	}
	public static void main(String[] args) {
		System.out.println(generateTrees(1).size());
	}
}
