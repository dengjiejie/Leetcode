package com.tju.edu.RecoverBinarySearchTree;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();

		helper(root, list);
		
		if(list.size() == 2){
			int temp = list.get(0).val;
			list.get(0).val = list.get(1).val;
			list.get(1).val =temp;
			
		}else if(list.get(0).val == list.get(3).val){
			int temp = list.get(1).val;
			list.get(1).val = list.get(2).val;
			list.get(2).val =temp;
		}else {
			int temp = list.get(1).val;
			list.get(1).val = list.get(3).val;
			list.get(3).val =temp;
		}
    }
	
	public void helper(TreeNode root, List<TreeNode> list) {
		
		if(root == null)return;
        helper(root.left,list);
        helper(root.right,list);

		if(list.size() == 4 )return;
		if (root.right != null && root.val >= root.right.val ){ 
			list.add(root);
			list.add(root.right);
			return ;
		}
		if (root.left != null && root.val <= root.left.val ){ 
			list.add(root);
			list.add(root.left);
			return ;
		} 
	}
	
	
	
	
	
}
