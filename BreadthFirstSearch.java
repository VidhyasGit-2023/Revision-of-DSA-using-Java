//Implementing Breadth-First Search Traversal using Deque and Iterative Method
public void BreadthFirstSearch(TreeNode root){

	Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
	if (root != null){
		queue.add(root);
	}
	
	int level = 0;
	while (!queue.isEmpty(){
		System.out.println("Level : "+level);
		int queueLength = queue.size();
		for (int i = 0;i < queueLength; i++){
			TreeNode curr = queue.removeFirst();
			System.out.println(" Print the BFS Node Value :"+curr.val);
			if (curr.left != null){
				queue.add(curr.left);
			}
			if (curr.right != null){
				queue.add(curr.right);
			}
			level++;
		}
		
	}

}