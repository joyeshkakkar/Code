/*Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.*/
public class BalancedBinaryTree {
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isBalanced(TreeNode root) {
        if (root==null || (root.left==null && root.right==null))
            return true;
        return Math.abs(depth(root.left)- depth(root.right))<=1  && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private int depth(TreeNode root){
        return (root==null)?0:1+Math.max(depth(root.left), depth(root.right));
    }
}
