//Remove Duplicates from Sorted List II
//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//For example,
//    Given 1->2->3->3->4->4->5, return 1->2->5.
//    Given 1->1->1->2->3, return 2->3.

//solution 1
class removeDuplicatesFromSortedListII {
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
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		while (head.next != null && head.next.next != null) {
			if (head.next.value == head.next.next.value) {
				int value = head.next.value;
				while (head.next != null && head.next.value == value) {
					head.next = head.next.next;
				}
			}
			else {
				head = head.next;
			}
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(1);
		p.next.next = new ListNode(2);
		p.next.next.next = new ListNode(5);
		p.next.next.next.next = new ListNode(5);
		ListNode result = deleteDuplicates(p);
		while (result != null) {
			System.out.println(result.value);
			result = result.next;
		}
	}
}
