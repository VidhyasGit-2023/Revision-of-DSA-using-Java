class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class RemoveFirstNodeInLinkedList {
	
	public static Node removeFirstNode (Node head){
		
		if (head == null){
			System.out.println("List has no values");
			return null;
		}
		
		Node temp = head;
		head = temp.next;
		
		return head;
		
	}		
	
	public static void main(String[] args) {
		
		Node head = new Node(3);
		head.next = new Node(6);
		head.next.next = new Node(8);
		head.next.next.next = new Node(9);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(13);
		
		head = removeFirstNode(head);
		
		while (head != null){
			System.out.println("List of values except the first node :"+ head.data);
			head = head.next;
		}
		
			
	}
}