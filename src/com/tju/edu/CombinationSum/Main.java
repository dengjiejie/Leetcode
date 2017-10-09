package com.tju.edu.CombinationSum;

import java.util.ArrayList;
import java.util.List;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candidates = {2,3,6,7};
		
		System.out.println(combinationSum(candidates, 7).toString());
		
		
		
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		helper(candidates,target, candidates.length-1, new ArrayList<Integer>(), list);
		return list;
	        
	}
	    
	public static List<List<Integer>> helper(int[] candidates,int target, int position, List<Integer> sublist, List<List<Integer>> list) {
		if(target == 0){
			list.add(new ArrayList<Integer>(sublist));
			return list;
		}		
		for(int i = position; i >= 0; i--){
			
			if(candidates[i] <= target){
				sublist.add(candidates[i]);
				helper(candidates,target - candidates[i], i, sublist, list);
				sublist.remove(sublist.size()-1);
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
}
