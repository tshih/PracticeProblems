package chapter2;

public class Node<T> {
	private Node next;
	private Node prev;
	private T data;

	public Node() {

	}
	
	public Node(T data) {
		this.data = data;
	}

	public Node(T data, Node next) {
		this.data = data;
	}

	public Node(T data, Node next, Node prev) {
		this.data = data;
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
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
