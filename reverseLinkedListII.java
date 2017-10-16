//Reverse Linked List II
//Reverse a linked list from position m to n. Do it in-place and in one-pass.
//For example:
//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//      return 1->4->3->2->5->NULL.
//      Note:
//      Given m, n satisfy the following condition:
//      1 ≤ m ≤ n ≤ length of list.

//solution 1
class reverseLinkedListII {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode reverse(ListNode head, int m, int n) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode previous = dummy;
		for (int i = 1; i <= m - 1; i++) {
			previous = previous.next;
		}
		ListNode current = previous.next;
		for (; m <= n - 1; m++) {
			ListNode next = current.next;
			current.next = next.next;
			next.next = previous.next;
			previous.next = next;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = new ListNode(5);
		ListNode q = reverse(p, 2, 4);
		System.out.println(q.value);
		System.out.println(q.next.value);
		System.out.println(q.next.next.value);
		System.out.println(q.next.next.next.value);
		System.out.println(q.next.next.next.next.value);
	}
}
