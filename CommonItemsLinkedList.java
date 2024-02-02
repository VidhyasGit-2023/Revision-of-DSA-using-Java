import java.util.HashSet;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class CommonItemsLinkedList {
	
	public static void findCommon (Node head1, Node head2){
		HashSet<Integer> set = new HashSet<>();
		
		while (head1 != null){
			set.add(head1.data);
			head1 = head1.next;
		}
		
		System.out.println("Common items between the linked lists:");
		while (head2 != null) {
			if (set.contains(head2.data)){
				System.out.println(head2.data);
			}
			head2 = head2.next;
		}
	}		
	
	public static void main(String[] args) {
		
		Node head1 = new Node(3);
		head1.next = new Node(6);
		head1.next.next = new Node(8);
		head1.next.next.next = new Node(9);
		head1.next.next.next.next = new Node(11);
		head1.next.next.next.next.next = new Node(13);
		
		Node head2 = new Node(3);
		head2.next = new Node(6);
		head2.next.next = new Node(8);
		
		findCommon(head1, head2);
		
	}
}