package chap2;

import java.util.Stack;

/**
 * Implement a function to check if a linked list is a palindrome.
 * 
 * @author JT
 *
 */

public class Q7 {

	public Node reverse(Node list) {
		Node head = null;
		while (list != null) {
			Node cur = new Node(list.data);
			cur.next = head;
			head = cur;
			list = list.next;
		}
		return head;	
	} 

	public Node reverse2(Node list) {
		Node previous = null;
		Node cur = list;
		Node next;
		while (cur != null) {
			next = cur.next;
			cur.next = previous;
			previous = cur;
			cur = next;
		}
		return previous;
	}

	public boolean isPalin(Node list) {
		Node fast = list;
		Node slow = list;

		while (fast != null && slow != null) {
			if (fast.next != null) {
				fast = fast.next.next;
			} else {
				break;
			}
			slow = slow.next;
		}

		Node reverse = reverse2(slow);

		while (reverse != null) {
			if (reverse.data != list.data) {
				return false;
			}
			reverse = reverse.next;
			list = list.next;
		}		
		return true;
	}

	public boolean isPalin2(Node list) {
		Stack<Node> s = new Stack<Node>();
		Node fast = list;
		Node slow = list;

		while (fast != null && slow != null) {
			if (fast.next != null) {
				fast = fast.next.next;
			} else {
				break;
			}
			s.push(slow);
			slow = slow.next;
		}

		if (fast != null) {
			slow = slow.next;
		}
		while (slow != null && !s.isEmpty()) {
			if (s.pop().data != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node a = new Node(1); 
		Node b = new Node(2); 
		Node c = new Node(3); 
		Node d = new Node(3); 
		Node e = new Node(2);
		Node f = new Node(2);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;



		Q7 q = new Q7();
		System.out.println(q.isPalin2(a));


	}

}
