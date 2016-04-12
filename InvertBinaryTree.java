//import SymmetricTree.TreeNode;
//
///*Invert a binary tree.
//
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//to
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1*/
//public class InvertBinaryTree {
//	/**
//	 * Definition for a binary tree node.
//	 */
//	private class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//		TreeNode(int x) { val = x; }
//	}
//
//	public TreeNode invertTree(TreeNode root) {
//		if((root==null) || (root.left==null && root.right==null))
//			return root;
//		TreeNode temp= root.left;
//		root.left=invertTree(root.right);
//		root.right=invertTree(temp);
//		return root;
//	}
//}
