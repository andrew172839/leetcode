//Flatten Binary Tree to Linked List
//Given a binary tree, flatten it to a linked list in-place.
//For example, Given
//1
/// \
//        2   5
//        / \   \
//            3   4   6
//            The flattened tree should look like:
//            1
//            \
//                2
//                \
//                    3
//                    \
//                        4
//                        \
//                            5
//                            \
//                                6

//solution 1                                
import java.util.Stack;
class flattenBinaryTreeToLinkedList {
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
	static void flatten(TreeNode root) {
		Stack<TreeNode> visit = new Stack<TreeNode>();
		visit.push(root);
		TreeNode previous = null;
		while (!visit.empty()) {
			TreeNode current = visit.pop();
			if (current.right != null) {
				visit.push(current.right);
			}
			if (current.left != null) {
				visit.push(current.left);
			}
			if (previous != null) {
				previous.left = null;
				previous.right = current;
			}
			previous = current;
		}
	}
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		p.right.left = new TreeNode(4);
		p.right.right = new TreeNode(5);
		flatten(p);
		System.out.println(p.value);
		System.out.println(p.right.value);
		System.out.println(p.right.right.value);
		System.out.println(p.right.right.right.value);
		System.out.println(p.right.right.right.right.value);
	}
}
