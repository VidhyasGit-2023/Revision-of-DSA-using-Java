//Implement Queue using Singly LinkedList
class LinkedList{
	int val;
	ListNode next;
	
	public LinkedList(int val){
		this.val = val;
		this.next = null;
	}
}
class Queue {
	
	ListNode head;
	ListNode tail;
	
	public Queue(){
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(int val){
		ListNode newNode = new ListNode(val);
		if (this.tail != null){
			this.tail.next = newNode;
			this.tail = this.tail.next;
		}else{
			this.head = newNode;
			this.tail = newNode;
		}
	}
	
	public int dequeue(){
		if (this.head == null){
			System.ext(0);
		}
		int val = this.head.val;
		this.head = this.head.next;
		if (this.head == null){
			this.tail == null;
		}
		return val;
		
	}
	
	public void print(){
		ListNode curr = this.head;
		while(curr != null){
			System.out.Println("Queue Elements :"+curr.val);
			curr = curr.next;
		}
	}

}