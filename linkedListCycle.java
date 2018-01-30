//Linked List Cycle
//Given a linked list, determine if it has a cycle in it.
//Follow up:
//Can you solve it without using extra space?

//solution 1
class linkedListCycle {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static boolean hasCycle(ListNode head) {
		if ((head == null) || (head.next == null)) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while ((fast != null) && (fast.next != null)) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = p.next;
		System.out.println(hasCycle(p));
	}
}
