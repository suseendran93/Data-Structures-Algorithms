package datastructures;

public class QueueV1 {

	Node head;
	private int first;

	static class Node {

		Node next;
		int data;

		public Node(int d) {
			next = null;
			data = d;
		}

	}

	public QueueV1() {
		head = null;
		first = 0;
	}

	public boolean isEmpty() {
		return (first == 0);
	}

	public void enQueue(int d) {

		if (head == null)
			head = new Node(d);
		else {
			Node temp = new Node(d);
			Node pointer = head;
		
			if (pointer != null) {
				while (pointer.next != null) {
					pointer = pointer.next;
				}
				pointer.next = temp;
			}
		
	}
		first++;
	}
	public void deQueue() {
			if(head!=null) {
				head=head.next;
			}
			else
				System.out.println("Queue is empty");
			first--;
	}

	public void printQueue() {
		Node current=head;

		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	public int get() {

		return 0;
	}

	public int size() {
		return first;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueV1 qu = new QueueV1();
		System.out.println(qu.isEmpty());
		System.out.println(qu.size());
		qu.enQueue(5);
		System.out.println(qu.size());
		qu.enQueue(6);
		qu.enQueue(7);
		qu.enQueue(8);
		System.out.println(qu.size());
		qu.deQueue();
		System.out.println(qu.size());
		qu.printQueue();
		qu.enQueue(9);
		qu.printQueue();
		System.out.println(qu.size());
		
	}
	

}
