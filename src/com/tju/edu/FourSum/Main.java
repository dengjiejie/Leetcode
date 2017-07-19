package com.tju.edu.FourSum;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,0,-1,0,-2,2};
		System.out.println(fourSum(height,0));
		System.out.println("dddd");
	}
	public static List<List<Integer>> fourSum(int[] nums, int target)  {
		int len = 4;
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] position = new int[len];
		int xpo = 0;
		int[] outString = new int[len]; 
		while (len > 0) {
			while(xpo < len-1){
				outString[xpo] = nums[position[xpo]];
				xpo++;
			}
			outString[xpo] = nums[position[xpo]];
			if(outString[0] + outString[1] + outString[2] + outString[3] == target ){
				list.add(Arrays.asList(outString[0], outString[1], outString[2], outString[3]));
				position[xpo] = 0;
				xpo--;
				if(xpo < 0)return list;
				position[xpo]++;
				while (nums[position[xpo]] == nums[position[xpo]-1]) {
					position[xpo]++;
					if(position[xpo] == nums.length){
						position[xpo] = 0;
						xpo--;
						if(xpo < 0)return list;
						position[xpo]++;
					}
				}
			}
			position[xpo]++;
			while (position[xpo] == nums.length) {
				position[xpo] = 0;
				xpo--;
				if(xpo < 0)return list;
				position[xpo]++;
				while (nums[position[xpo]] == nums[position[xpo]-1]) {
					position[xpo]++;
				}
				
			}
		}
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static List<List<Integer>> fourSum(int[] nums, int target)  {
//		Arrays.sort(nums);
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		for(int g = 0; g < nums.length-3; g++){
//			if (g > 0 && nums[g] == nums[g - 1]) {              
//	            continue;
//	        }
//			int target1 = target - nums[g]; 
//			for(int i = g+1; i < nums.length -2; i++){
//				if (i > g+1 && nums[i] == nums[i - 1]) {              
//		            continue;
//		        }
//				int j = i + 1;
//				int k = nums.length - 1;
//				int target2 = target1- nums[i];
//			    while (j < k) {
//			    	if (nums[j] + nums[k] == target2) {
//			    		list.add(Arrays.asList(nums[g],nums[i], nums[j], nums[k]));
//			            j++;
//			            k--;
//			            while (j < k && nums[j] == nums[j - 1]) j++;  
//			            while (j < k && nums[k] == nums[k + 1]) k--;  
//			        } else if (nums[j] + nums[k] > target2) {
//			            k--;
//			        } else {
//			            j++;
//			        }   
//				}
//			}
//		}
//		return list;
//    }
}
