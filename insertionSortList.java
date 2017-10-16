//Insertion Sort List
//Sort a linked list using insertion q.

//solution 1
class insertionSortList {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		ListNode current = head;
		while (current != null) {
			ListNode previous = dummy;
			while (previous.next != null && previous.next.value <= current.value) {
				previous = previous.next;
			}
			ListNode temp = current.next;
			current.next = previous.next;
			previous.next = current;
			current = temp;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(5);
		p.next = new ListNode(2);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(4);
		p.next.next.next.next = new ListNode(1);
		ListNode q = insertionSortList(p);
		System.out.println(q.value);
		System.out.println(q.next.value);
		System.out.println(q.next.next.value);
		System.out.println(q.next.next.next.value);
		System.out.println(q.next.next.next.next.value);
	}
}
