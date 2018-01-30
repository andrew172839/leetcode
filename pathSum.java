//Path Sum
//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//For example:
//Given the below binary tree and sum = 22,
//      5
//      / \
//          4   8
//          /   / \
//              11  13  4
//              /  \      \
//                  7    2      1
//                  return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

//solution 1                  
class pathSum {
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
	static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			throw new IllegalArgumentException();
		}
		if ((root.left == null) && (root.right == null)) {
			return (root.value == sum);
		}
		return (hasPathSum(root.left, sum - root.value) == true || hasPathSum(root.right, sum - root.value) == true);
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(4);
		p.left.right = new TreeNode(5);
		p.right = new TreeNode(3);
		System.out.println(hasPathSum(p, 9));
	}
}

//solution 2
import java.util.Queue;
import java.util.LinkedList;
class pathSum {
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
	static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			throw new IllegalArgumentException();
		}
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> values = new LinkedList<Integer>();
		nodes.add(root);
		values.add(root.value);
		while (nodes.isEmpty() == false) {
			TreeNode current = nodes.poll();
			int valueSum = values.poll();
			if (current.left == null && current.right == null && valueSum == sum) {
				return true;
			}
			if (current.left != null) {
				nodes.add(current.left);
				values.add(valueSum + current.left.value);
			}
			if (current.right != null) {
				nodes.add(current.right);
				values.add(valueSum + current.right.value);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(5);
		p.left.right = new TreeNode(6);
		p.right = new TreeNode(3);
		System.out.println(hasPathSum(p, 10));
	}
}
