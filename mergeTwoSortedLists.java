//Merge Two Sorted Lists
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

//solution 1
class mergeTwoSortedLists {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		while (l1 != null && l2 != null) {
			if (l1.value < l2.value) {
				current.next = l1;
				current = current.next;
				l1 = l1.next;
			}
			else {
				current.next = l2;
				current = current.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			current.next = l2;
		}
		else {
			current.next = l1;
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(3);
		p.next.next = new ListNode(5);
		ListNode q = new ListNode(2);
		q.next = new ListNode(4);
		q.next.next = new ListNode(6);
		ListNode merge = mergeTwoLists(p, q);
		System.out.println(merge.value);
		System.out.println(merge.next.value);
		System.out.println(merge.next.next.value);
		System.out.println(merge.next.next.next.value);
		System.out.println(merge.next.next.next.next.value);
		System.out.println(merge.next.next.next.next.next.value);
	}
}
