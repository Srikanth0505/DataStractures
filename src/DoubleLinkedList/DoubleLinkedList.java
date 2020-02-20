package DoubleLinkedList;

public class DoubleLinkedList {

	class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;

	public void addNode(int data) {
		
        Node newNode = new Node(data);  
          
        if(head == null) {  
            head = tail = newNode;  
            head.prev = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
		
	}

	public void display() {

		Node current = head;
		if (current == null) {
			System.out.println("Your Double Linked List is Empty.....");
			return;
		}
		System.out.println("Your Double Linked List is: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		DoubleLinkedList Dsl = new DoubleLinkedList();

		Dsl.addNode(1);
		Dsl.addNode(2);
		Dsl.addNode(3);
		Dsl.addNode(4);
		Dsl.addNode(5);
		Dsl.addNode(6);

		Dsl.display();

	}

}
