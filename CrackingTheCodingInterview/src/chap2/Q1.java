package chap2;

import java.util.HashSet;

/** 
 * Write code to remove duplicates from an unsorted linked list.
 * 
 * @author JT
 *
 */
public class Q1 {

	public void removeDups(Node head) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node n = head;
		Node previous = null;

		while (n != null) {
			if (hs.contains(n.data)) {
				previous.next = n.next;
			} else {
				hs.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}

	public void removeDup2(Node head) {
		Node cur = head;

		while (cur != null) {
			Node runner = cur;
			while (runner.next != null) {
				if (cur.data == runner.next.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			cur = cur.next;
		}
	}


	public static void main(String[] args) {
		Node a = new Node(1); 
		Node b = new Node(2); 
		Node c = new Node(3); 
		Node d = new Node(2); 
		Node e = new Node(2);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;



		Q1 q = new Q1();

		q.removeDup2(a);

		Node n = a;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;			
		}

	}

}
