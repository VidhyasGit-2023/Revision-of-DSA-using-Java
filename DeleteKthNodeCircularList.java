class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this .next = null;
	}
}
public class DeleteKthNodeCircularList {
	
	public static Node DeleteKthNode(Node head, int k){
		if (head == null || k <= 0){
			System.out.println("There is no Kth Node");
			return head;
		}
		
		Node current = head;
		System.out.println("Outside While current :"+ current.data);
		Node previous = null;
		
		while (true){
			for (int i = 0; i < k-1; i++){
				previous = current;
				System.out.println("Inside While previous :"+ previous.data);
				current = current.next;
				System.out.println("Inside While current :"+ current.data);
			}
			
			previous.next = current.next;
			
			System.out.println("Inside Delete Method previous :"+ previous.data);
			current = previous;

			System.out.println("Inside Delete Method current :"+ current.data);
			
			System.out.println("Inside Delete Method head :"+ head.data);
			
			if (current == head){
				break;
			}
		}
		
		return current;
			
	}
	
	public static void displayList(Node head){
		Node current = head;
		
		if (head != null){
			
			do {
				System.out.println("List of values :"+ head.data);
				head = head.next;
			}while (current != head);
		}
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = head;
		
		System.out.println("Before Deletion");
		displayList(head);
		
		int k = 3;
		
		head = DeleteKthNode(head, k);
		
		System.out.println("After Deletion");
		displayList(head);
		
		
	}
	
}