package SingleLinkedList;

public class SingleLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node head = null;
	public Node tail = null;

	public void AddNode(int data) {

		Node newData = new Node(data);

		if (head == null) {
			head = newData;
			tail = newData;
		} else {
			tail.next = newData;
			tail = newData;
		}
	}

	public void display() {

		Node Current = head;
		
		if (head == null) {
			System.out.println("SingleLinkedList is Empty....");
			return;

		}
		System.out.print("your SingleLinkedList :");
		while (Current != null) {

			
			System.out.print(" "+Current.data);
			Current = Current.next;

		}
	}

	public static void main(String[] args) {

		SingleLinkedList sLinkedList = new SingleLinkedList();
		sLinkedList.AddNode(1);
		sLinkedList.AddNode(2);
		sLinkedList.AddNode(3);
		sLinkedList.AddNode(4);
		sLinkedList.AddNode(5);

		sLinkedList.display();

	}

}
