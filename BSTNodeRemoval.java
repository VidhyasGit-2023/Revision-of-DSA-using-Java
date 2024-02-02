//Binary Search Tree - Removing a Node from BST Implementation
class BSTNodeRemoval {
    public TreeNode minimumVal(TreeNode root) {
        TreeNode curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minVal = minimumVal(root);
                root.val = minVal.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }
}