package com.tju.edu.Permutations;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,3,4,1,5,1};
		System.out.println(permute(height));
	}
	
	
	public static List<List<Integer>> permute(int[] nums) {
        List<Integer> num = new ArrayList<Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            num.add(nums[i]);
        }
        return helper(new ArrayList<List<Integer>>(), num, new ArrayList<Integer>());
    }
    
    public static List<List<Integer>> helper(List<List<Integer>> list, List<Integer> num, List<Integer> result ){
        
        if(num.size() == 0){
            list.add(new ArrayList<Integer>(result));
            return list;
        }
        
        int len = num.size();
        
        for(int i = 0 ; i < len; i++){
            result.add(num.get(i));
            num.remove(i);
            helper(list, num ,result);
            num.add(i,result.get(result.size()-1));
            result.remove(result.size()-1);
        }
        return list;   
    }
	
	
	
	
	
	
	
	
	
	
}
