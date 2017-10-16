//Swap Nodes in Pairs
//Given a linked list, swap every two adjacent nodes and return its head.
//For example,
//    Given 1->2->3->4, you should return the list as 2->1->4->3.
//    Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

//solution 1
class swapNodesInPairs {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode newhead = head.next;
		head.next = swapPairs(head.next.next);
		newhead.next = head;
		return newhead;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = new ListNode(5);
		ListNode q = swapPairs(p);
		System.out.println(q.value);
		System.out.println(q.next.value);
		System.out.println(q.next.next.value);
		System.out.println(q.next.next.next.value);
		System.out.println(q.next.next.next.next.value);
	}
}
