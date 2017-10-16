//Copy List with Random Pointer
//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//Return a deep q of the list.

//solution 1
import java.util.HashMap;
class qListWithRandomPointer {
	static class RandomListNode {
		int label;
		RandomListNode next;
		RandomListNode random;
		RandomListNode(int x) {
			label = x;
			next = null;
			random = null;
		}
	};
	static RandomListNode qRandomList(RandomListNode head) {
		if (head == null) {
			return null;
		}
		RandomListNode p = head;
		HashMap<RandomListNode, RandomListNode> hashmap = new HashMap<RandomListNode, RandomListNode>();
		while (p != null) {
			RandomListNode q = new RandomListNode(p.label);
			hashmap.put(p, q);
			p = p.next;
		}
		p = head;
		while (p != null) {
			RandomListNode q = hashmap.get(p);
			if (p.next != null) {
				q.next = hashmap.get(p.next);
			}
			if (p.random != null) {
				q.random = hashmap.get(p.random);
			}
			p = p.next;
		}
		return hashmap.get(head);
	}
	public static void main(String[] args) {
		RandomListNode p = new RandomListNode(1);
		p.next = new RandomListNode(2);
		p.next.next = new RandomListNode(3);
		p.next.next.next = new RandomListNode(4);
		p.next.next.next.next = new RandomListNode(5);
		p.random = p.next.next.next.next;
		p.next.random = p.next.next.next;
		p.next.next.random = p.next.next;
		p.next.next.next.random = p.next;
		p.next.next.next.next.random = p;
		RandomListNode q = qRandomList(p);
		System.out.println(q.label);
		System.out.println(q.next.label);
		System.out.println(q.next.next.label);
		System.out.println(q.next.next.next.label);
		System.out.println(q.next.next.next.next.label);
		System.out.println(q.random.label);
		System.out.println(q.next.random.label);
		System.out.println(q.next.next.random.label);
		System.out.println(q.next.next.next.random.label);
		System.out.println(q.next.next.next.next.random.label);
	}
}
