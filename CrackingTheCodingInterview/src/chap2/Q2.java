package chap2;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * @author JT
 *
 */
public class Q2 {

	public Node findKth(int k, Node head) {
		Node runner = head;
		while (k > 1 && runner != null) {
			runner = runner.next;
			k--;
		}

		if (k != 1) {
			return null;
		}

		Node n = head;

		while (runner.next != null) {
			n = n.next;
			runner = runner.next;
		}

		return n;
	}


	public static void main(String[] args) {
		Node a = new Node(1); 
		Node b = new Node(2); 
		Node c = new Node(3); 
		Node d = new Node(4); 
		Node e = new Node(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		Q2 q = new Q2();
		System.out.println(q.findKth(3, a).data);

	}

}
