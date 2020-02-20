package SingleLinkedList;

public class SLinkedListDisplay {

	static class Node {
		int Data;
		Node next;

		public Node(int d) {
			Data = d;
			next = null;
		}

	}

	public Node head;

	int count;

	public void display() {

		Node n = head;
		System.out.print("SingleLinkedList is: ");
		while (n != null) {

			count++;
			System.out.print(n.Data + " ");
			n = n.next;

		}
		System.out.println();
		System.out.println("Total no of Nodes Count is :" + count);
	}

	public static void main(String[] args) {

		SLinkedListDisplay slist = new SLinkedListDisplay();

		slist.head = new Node(100);

		Node second = new Node(200);
		Node third = new Node(300);
		Node fourth = new Node(400);

		slist.head.next = second;
		second.next = third;
		third.next = fourth;

		slist.display();

	}

}
