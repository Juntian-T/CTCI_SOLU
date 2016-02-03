package chap2;

public class Node {
	Node next = null;
	int data;
	
	public Node(int d) {
		data = d;
	}
	
	public void add(int n) {
		Node node = new Node(n);
		Node head = this;
		
		while (head.next != null) {
			head = head.next;
		}
		head.next = node;
	}
}
