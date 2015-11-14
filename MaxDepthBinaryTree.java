/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.*/
public class MaxDepthBinaryTree {
	/**
	 * Definition for a binary tree node.
	 */
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public int maxDepth(TreeNode root) {
		return (root == null)?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}

}
