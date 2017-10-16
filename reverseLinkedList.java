//Reverse Linked List (without recursive)
//    Reverse a singly linked list.
//    click to show more hints.
//    Hint:
//    A linked list can be reversed either iteratively or recursively. Could you implement both?

//solution 1
class reverseLinkedList {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode next = head.next;
		while (head != null) {
			next = head.next;
			head.next = previous;
			previous = head;
			head = next;
		}
		return previous;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		ListNode q = reverseList(p);
		ListNode temp = q;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}
