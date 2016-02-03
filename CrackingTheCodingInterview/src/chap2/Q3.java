package chap2;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked list, 
 * given only access to that node.
 * 
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a- >b- >d->e 
 * 
 * @author JT
 *
 */
public class Q3 {
	
	public void deleteMiddle(Node node) {
		while (node.next.next != null) {
			node.data = node.next.data;
			node = node.next;
		}
		node.data = node.next.data;
		node.next = null;
	}
	
	public static void main(String[] args){
		Node a = new Node(1); 
		Node b = new Node(2); 
		Node c = new Node(3); 
		Node d = new Node(4); 
		Node e = new Node(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		Node n = a;
		while (n != null) {
			System.out.print(n.data);
			n = n.next;			
		}
		
		System.out.println();
		Q3 q = new Q3();
		q.deleteMiddle(d);
		
		n = a;
		while (n != null) {
			System.out.print(n.data);
			n = n.next;			
		}
		
		
	}

}
