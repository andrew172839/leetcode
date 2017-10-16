//Add Two Numbers
class addTwoNumbers {
	static class ListNode {
		int value;
		ListNode next;
		ListNode(int x) {
			value = x;
			next = null;
		}
	}
	static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int i1 = 0;
		int i2 = 0;
		int carry = 0;
		ListNode temp = null;
		ListNode result = null;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				i1 = 0;
			}
			else {
				i1 = l1.value;
			}
			if (l2 == null) {
				i2 = 0;
			}
			else {
				i2 = l2.value;
			}
			ListNode node = new ListNode((i1 + i2 + carry) % 10);
			carry = (i1 + i2 + carry) / 10;
			if (temp == null) {
				temp = node;
				result = node;
			}
			else {
				temp.next = node;
				temp = temp.next;
			}
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		if (carry == 1) {
			temp.next = new ListNode(1);
		}
		return result;
	}
	public static void main(String[] args) {
		ListNode p = new ListNode(9);
		p.next = new ListNode(9);
		p.next.next = new ListNode(9);
		ListNode q = new ListNode(9);
		q.next = new ListNode(9);
		q.next.next = new ListNode(9);
		ListNode result = addTwoNumbers(p, q);
		System.out.println(result.value);
		System.out.println(result.next.value);
		System.out.println(result.next.next.value);
		System.out.println(result.next.next.next.value);
	}
}
