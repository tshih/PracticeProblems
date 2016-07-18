package chapter2;

public class Node {
	private Node next;
	private Node prev;
	private int data;

	public Node() {

	}
	
	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
	}

	public Node(int data, Node next, Node prev) {
		this.data = data;
	}

	public static Node createLinkedList(int[] data) {

		Node prev = new Node(data[0]);
		Node first = prev;

		for(int i = 1; i < data.length ; i++) {
			Node next = new Node(data[i], null, prev);
			prev.setNext(next);
			prev = next;
		}

		return first;
	}

	public int getSize() {
		int size = 1;
		Node n = this;
		while(n.hasNext()) {
			size++;
			n = n.getNext();
		}
		return size;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public boolean hasNext() {
		return this.next != null;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
