//Remove Nth Node From End of List
//Given a linked list, remove the nth node from the end of list and return its head.
//For example,
//    Given linked list: 1->2->3->4->5, and n = 2.
//    After removing the second node from the end, the linked list becomes 1->2->3->5.
//    Note:
//    Given n will always be valid.
//    Try to do this in one pass.

//solution 1
class removeNthNodeFromEndOfList {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode removeNthFromEnd(ListNode head, int n) {
		if ((head == null) || (head.next == null) || (n <= 0)) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = new ListNode(5);
		ListNode q = removeNthFromEnd(p, 1);
		System.out.println(q.value);
		System.out.println(q.next.value);
		System.out.println(q.next.next.value);
		System.out.println(q.next.next.next.value);
	}
}
