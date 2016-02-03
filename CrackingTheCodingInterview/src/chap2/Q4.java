package chap2;

/** 
 * 
 * Write code to partition a linked list around a value x, such that 
 * all nodes less than x come before all nodes greater than or equal to x.
 * 
 * @author JT
 *
 */
public class Q4 {

	public Node partition(Node list, int x) {
		Node n = list;
		while (n != null && n.data >= x) {
			n = n.next;
		}
		if (n == null) return list;

		Node m = list;
		while (m != null && m.data < x ) {
			m = m.next;
		}
		if (m == null) return list;

		Node firstHalf = new Node(n.data);
		Node secondHalf = new Node(m.data);

		Node result1 = firstHalf;
		Node result2 = secondHalf;

		n = n.next;
		while (n != null) {
			if (n.data < x) {
				firstHalf.next = n;
				firstHalf = firstHalf.next;
			}
			n = n.next;
		}

		m = m.next;
		while (m != null) {
			if (m.data >= x) {
				secondHalf.next = m;
				secondHalf = secondHalf.next;
			}
			m = m.next;
		}
		secondHalf.next = null;

		firstHalf.next = result2;

		return result1;
	}


	public static void main(String[] args) {
		Node a = new Node(42); 
		Node b = new Node(32); 
		Node c = new Node(24); 
		Node d = new Node(25); 
		Node e = new Node(11);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		Node n = a;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;			
		}
		
		System.out.println();
		Q4 q = new Q4();
		
		Node r = q.partition(a, 25);
		
		while (r != null) {
			System.out.print(r.data + " ");
			r = r.next;			
		}

	}

}
