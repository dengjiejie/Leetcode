package com.tju.edu.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	//还有一种递归写法
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root != null)queue.add(root);
		int len = 0;
		while (!queue.isEmpty()) {
			len = queue.size();
			List<Integer> list2 = new ArrayList<Integer>();
			list.add(list2);
			for(int i = 0; i < len; i++ ){
				root = queue.poll();
				if(root.left != null)queue.add(root.left);
				if(root.right != null)queue.add(root.right);
				list2.add(root.val);
			}
		}
		return list;
    }	
}
