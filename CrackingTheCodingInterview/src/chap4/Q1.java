package chap4;


/**
 * Implement a function to check if a binary tree is balanced. 
 * For the purposes of this question, a balanced tree is defined to be a tree such that 
 * the heights of the two subtrees of any node never differ by more than one.
 * @author JT
 *
 */

public class Q1 {

	public int height(TreeNode root) {
		if (root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
		
	}
		
	//NOPE!!THIS IS NOT RIGHT!!
//	public boolean isBalanced(TreeNode root) {
//		int left = height(root.left);
//		int right = height(root.right);
//		
//		if (Math.abs(left-right) > 1) {
//			return false;
//		} else {
//			return true;
//		}
//	}
	
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int left = height(root.left);
		int right = height(root.right);
		
		if (Math.abs(left-right) > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}
	
	public int checkHeight(TreeNode root) {
		if (root == null) return 0;
		
		int left = checkHeight(root.left);
		if (left == -1) return -1; 
		
		int right = checkHeight(root.right);
		if (right == -1) return -1;
		
		if (Math.abs(left - right) > 1) {
			return -1;
		} else {
			return Math.max(checkHeight(root.left), checkHeight(root.right)) + 1;
		}
	}
	
	public boolean isBalanced2(TreeNode root) {
		return checkHeight(root) != -1;
	}
	
	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		TreeNode a7 = new TreeNode(7);
		TreeNode a8 = new TreeNode(8);
		TreeNode a9 = new TreeNode(9);

		a1.left = a2;
		a1.right = a3;

		a2.left = a4;
		a2.right = a5;

		a3.left = a6;
		a3.right = a7;

		a4.left = a8;
		a8.right = a9;
		
		Q1 q = new Q1();
		System.out.println(q.isBalanced2(a1));
	}
}
