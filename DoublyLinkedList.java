//Implementing DoublyLinkedList
class DoublyLinkedList{

	DoublyLinkedListNode head;
	DoublyLinkedListNode tail;
	
	public DoublyLinkedList(){
		head = new DoublyLinkedListNode(-1);
		tail = new DoublyLinkedListNode(-1);
		head.next = tail;
		tail.prev = head;
	}
	
	public void InsertFront(int val) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(val);
		newNode.prev = head;
		newNode.next = head.next;
		
		head.next.prev = newNode;
		head.next = newNode;
	}
	
	public void InsertEnd(int val) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(val);
		newNode.next = tail;
		newNode.prev = tail.prev;
		
		tail.prev.next = newNode;
		tail.prev = newNode;
	}
	
	public void RemoveFront() {
		head.next.next.prev = head;
		head.next = head.next.next;
	}
	
	public void RemoveEnd() {
		tail.prev.prev.next = tail;
		tail.prev = tail.prev.prev;
	}
	
	public void print() {
		DoublyLinkedListNode curr = head.next;
		while (curr != tail){
			System.out.println("Print the Final List"+curr.val);
			curr = curr.next;
		}
	}
}