package com.tju.edu.Combinations;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combine(11,2));
	}

	
	
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		helper(list, new ArrayList<Integer>(), n,1,k);
		return list;
    }
	
	public static void helper(List<List<Integer>> list,List<Integer> sublist, int n,int start,int k) {
		if(k==0) {
			list.add(new ArrayList<Integer>(sublist));
			return ;
		}
		for (int i = start; i <= n- k + 1; i++) {
			sublist.add(i);
			helper(list,sublist, n,i+1, k-1);
			sublist.remove(sublist.size()-1);
		}
		return ;
	}
	
	
	
}
