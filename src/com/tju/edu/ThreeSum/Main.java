package com.tju.edu.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0, 0, 0, 2, -1, -4};
		System.out.println(threeSum(height));
	}

	
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < nums.length -2; i++){
			if (i > 0 && nums[i] == nums[i - 1]) {              
	            continue;
	        }
			if (nums[i] > 0)
                continue;
			int j = i + 1;
			int k = nums.length - 1;
			int target = -nums[i];
		    while (j < k) {
		    	if (nums[j] + nums[k] == target) {
		    		list.add(Arrays.asList(nums[i], nums[j], nums[k]));
		            j++;
		            k--;
		            while (j < k && nums[j] == nums[j - 1]) j++;  
		            while (j < k && nums[k] == nums[k + 1]) k--;  
		        } else if (nums[j] + nums[k] > target) {
		            k--;
		        } else {
		            j++;
		        }   
			}
		}
		return list;
    }
}
