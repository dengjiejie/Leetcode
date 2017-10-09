package com.tju.edu.CombinationSumII40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candidates = {10,1,2,7,6,1,5};
		
		System.out.println(combinationSum2(candidates, 8).toString());
		
		
		
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		Arrays.sort(candidates);
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
				helper(candidates,target - candidates[i], i-1, sublist, list);
				sublist.remove(sublist.size()-1);
			}
			if(i > 0 && candidates[i-1] == candidates[i])i--;
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
}
