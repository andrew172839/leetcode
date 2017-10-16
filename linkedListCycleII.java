//Linked List Cycle II
//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//Follow up: Can you solve it without using extra space?

//solution 1
class linkedListCycleII {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode detectCycle(ListNode head) {
		if (head == null) {
			throw new IllegalArgumentException("");
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				while (fast != head) {
					fast = fast.next;
					head = head.next;
				}
				return fast;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = p;
		System.out.println(detectCycle(p).value);
	}
}
