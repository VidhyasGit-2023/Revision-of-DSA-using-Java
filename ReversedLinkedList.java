//Implementation of Reversed Linked List
class ReversedLinkedList{
	//Recursive Method
	public ListNode ReverseLinkedList(ListNode node){
		return Reverse(node, null);
	}
	
	public ListNode Reverse(ListNode node, ListNode prev){
		if (node == null){
			return prev;
		}
		ListNode temp = node.next;
		node.next = prev;
		return Reverse(temp, node);
	}
	
	//Iteration Method
	public ListNode ReverseLinkedList(ListNode node){
		ListNode curr = head;
		ListNode prev = null;
		ListNode currNext = null;
		
		while (curr != null){
			currNext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = currNext;
		}
		return prev;
	}



}