package chap2;

public class Q5 {

	public Node add(Node num1, Node num2) {
		Node m = num1;
		Node n = num2;

		Node result = new Node((m.data+n.data) % 10);
		Node runner = result;
		
		int offset = m.data+n.data > 10 ? 1 : 0;
		m = m.next;
		n = n.next;
		while (m != null || n != null) {
			int a = 0, b = 0;
			if (m != null) a = m.data;
			if (n != null) b = n.data;

			Node cur = new Node((a+b+offset)%10);
			offset = a+b+offset > 10 ? 1 : 0;

			runner.next = cur;
			runner = cur;

			if (m != null) m = m.next;	
			if (n != null) n = n.next;
		}

		if (offset == 1) runner.next = new Node(1);

		return result;
	}

	public static void main(String[] args){
		Node a = new Node(9); 
		Node b = new Node(9); 
		Node c = new Node(9); 
		Node d = new Node(4); 
		
		Node e = new Node(9);
		Node f = new Node(9); 
		Node g = new Node(9);

		a.next = b;
		b.next = c;
		c.next = d;
		
		e.next = f;
		f.next = g;
		
		Q5 q = new Q5();
		Node r = q.add(e, a);
		
		while (r != null) {
			System.out.print(r.data + " ");
			r = r.next;			
		}
	}
}
