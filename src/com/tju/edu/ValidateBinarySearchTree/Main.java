package com.tju.edu.ValidateBinarySearchTree;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	
	public boolean isValidBST(TreeNode root) {
		TreeNode treeNode;
		if(root == null)return true;
		if(root.left == null && root.right == null)return true;
		if(root.left != null ){
			treeNode = root.left;
			while (treeNode.right != null) {
				treeNode = treeNode.right;
			}
			if(root.val <= treeNode.val )
			return false;
		}
		if(root.right != null ){
			treeNode = root.right;
			while (treeNode.left != null) {
				treeNode = treeNode.left;
			}
			if(root.val >= treeNode.val )
			return false;
		}
		return isValidBST(root.left)&&isValidBST(root.right);
    }
}
