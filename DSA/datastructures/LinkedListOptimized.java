package datastructures;

public class LinkedListOptimized {

	Node head;
	Node tail;// Implement this
	private int listSize;

	static class Node {

		Node next;
		Object data;

		public Node(Object data) {

			this.data = data;
			next = null;
		}

	}

	public LinkedListOptimized() {
		head = null;
		listSize = 0;

	}

	public void add(Object data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = new Node(data);
			Node pointer = head;

			if (pointer != null) {
				while (pointer.next != null) {
					pointer = pointer.next;
				}
				pointer.next = temp;
			}
		}
		listSize++;
	}

	public void printAll() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Object get(int index) {

		Node pointer = null;
		if (head != null) {
			pointer = head;
			for (int i = 0; i < index; i++) {
				pointer = pointer.next;
			}
			return pointer.data;
		}
		return pointer;

	}

	public int size() {
		return listSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOptimized list = new LinkedListOptimized();
		list.add(5);
		list.add("Proud");
		list.add(5.12);
		list.add(4);
		list.add(6);
		list.add(6);

		System.out.println(list.get(2));
		// list.printAll();
		System.out.println(list.size());

	}

}
