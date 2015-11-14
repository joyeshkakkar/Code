/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3*/
public class SymmetricTree {
	/**
	 * Definition for a binary tree node.
	 */
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right){
        if(left==null)
            return (right==null);
        if(right==null)
            return false;
        return (left.val==right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
