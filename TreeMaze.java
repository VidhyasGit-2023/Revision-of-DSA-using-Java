//Implementation of Tree Maze alike Breadth First Search
public class TreeMaze{

	public boolean canReachLeaf(TreeNode root){
		if ( root == null || root.val == 0){
			return false;
		}
		
		if (root.left == null && root.right == null){
			return true;
		}
		if (canReachLeaf(root.left)){
			return true;
		}
		if (canReachLeaf(root.right)){
			return true;
		}
		return false;
	}
	
	public boolean canReachLeaf(TreeNode root, List path){
		if ( root == null || root.val == 0){
			return false;
		}
		
		path.add(root.val);
		if (root.left == null && root.right == null){
			return true;
		}
		if (canReachLeaf(root.left, path)){
			return true;
		}
		if (canReachLeaf(root.right,path)){
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}


}