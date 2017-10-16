//Remove Duplicates from Sorted List
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//For example,
//    Given 1->1->2, return 1->2.
//    Given 1->1->2->3->3, return 1->2->3.

//solution 1
class removeDuplicatesFromSortedList {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			throw new IllegalArgumentException("");
		}
		ListNode p = head;
		while (p.next != null) {
			if (p.value == p.next.value) {
				p.next = p.next.next;
			}
			else {
				p = p.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(1);
		p.next.next = new ListNode(2);
		p.next.next.next = new ListNode(5);
		p.next.next.next.next = new ListNode(5);
		ListNode q = deleteDuplicates(p);
		while (q != null) {
			System.out.println(q.value);
			q = q.next;
		}
	}
}
