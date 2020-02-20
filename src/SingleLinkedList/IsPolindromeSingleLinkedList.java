package SingleLinkedList;

public class IsPolindromeSingleLinkedList {

	class Node {
		int Data;
		Node next = null;

		public Node(int data) {
			this.Data = data;
			this.next = null;
		}
	}

	public int size;
	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		}

		if (head != null) {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void display() {
		
		Node current = head;

		if (head == null) {

			System.out.println("Your likedlist is Empty");
			return;
		}  
		System.out.print("your liked list :");
		while(current != null) {

			System.out.print(current.Data+" ");
			
			current = current.next;
		}
		System.out.println();

	}

	public void isPolindrome() {
		
		Node pCurrent=head;
		boolean flag=true;
		
		int mid=(size%2==0)?(size/2):((size+1)/2);
		
		for (int i = 0; i < mid; i++) {
			pCurrent=pCurrent.next;
		}
		
		Node revHead=reverseList(pCurrent.next);
		
		while (head!=null && revHead!=null) {
			if(head.Data != revHead.Data) {
				
				flag=false;
				break;
			}
			head=head.next;
			revHead=revHead.next;
		}
		
		if (flag) {
			System.out.println("given Single list is Polindrome");
		}else {
			System.out.println("given Single list is not a Polindrome");
		}
	}
	
	public Node reverseList(Node temp) {
		
		Node current=temp;
		Node prevNode=null;
		Node nextNode=null;
		
		while (current!=null) {
			
			nextNode=current.next;
			current.next=prevNode;
			prevNode=current;
			current=nextNode;
		}
		
		return prevNode;
	}
	
	

	public static void main(String[] args) {

		IsPolindromeSingleLinkedList polindrome = new IsPolindromeSingleLinkedList();
		
		polindrome.addNode(1);
		polindrome.addNode(2);
		polindrome.addNode(3);
		polindrome.addNode(2);
		polindrome.addNode(1);

		polindrome.display();
		
		polindrome.isPolindrome();
	}

}
