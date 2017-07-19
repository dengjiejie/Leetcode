package com.tju.edu.ThreeSumClosest;

import java.util.Arrays;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {-1, 2 ,1 ,-4};
		System.out.println(threeSumClosest(height,-3));
	}

	
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int close = Integer.MAX_VALUE; 
		int total;
		for(int i = 0; i < nums.length -2; i++){
			if (i > 0 && nums[i] == nums[i - 1]) {              
	            continue;
	        }
			int j = i + 1;
			int k = nums.length - 1;
		    while (j < k) {
				if(close - target == 0)return close;
		    	total =  nums[j] + nums[k] + nums[i];
		    	if (Math.abs(total - target) < Math.abs(close - target)) {
		        	close = total;
		        } 
//		    	else if (Math.abs(total - target) == Math.abs(close - target)) {
//		    		if(total - target > 0){
//		    			close = total;
//					}
//		        } 
		    	if(total - target > 0){
	    			k--;
		            while (j < k && nums[k] == nums[k + 1]) k--;  
	    		}else {
					j++;
		            while (j < k && nums[j] == nums[j - 1]) j++;  
				}
			}
		}
		return close;
    }
}
