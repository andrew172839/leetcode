//Partition List
//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//You should preserve the original relative order of the nodes in each of the two partitions.
//For example,
//    Given 1->4->3->2->5->2 and x = 3,
//    return 1->2->2->4->3->5.

//solution 1
class partitionList {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode partition(ListNode head, int x) {
		ListNode large = new ListNode(-1);
		ListNode small = new ListNode(-1);
		ListNode p = large;
		ListNode q = small;
		while (head != null) {
			if (head.value >= x) {
				large.next = new ListNode(head.value);
				large = large.next;
			}
			else {
				small.next = new ListNode(head.value);
				small = small.next;
			}
			head = head.next;
		}
		small.next = p.next;
		return q.next;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.next = new ListNode(4);
		p.next.next = new ListNode(3);
		p.next.next.next = new ListNode(2);
		p.next.next.next.next = new ListNode(5);
		p.next.next.next.next.next = new ListNode(2);
		ListNode q = partition(p, 3);
		System.out.println(q.value);
		System.out.println(q.next.value);
		System.out.println(q.next.next.value);
		System.out.println(q.next.next.next.value);
		System.out.println(q.next.next.next.next.value);
		System.out.println(q.next.next.next.next.next.value);
	}
}
