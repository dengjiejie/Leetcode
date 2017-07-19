package com.tju.edu.NextPermutation;

import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,3,2};
		
		long startTime=System.nanoTime();  

		System.out.println(Arrays.toString(nextPermutation(height)));

		long endTime=System.nanoTime(); 

		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
	
	public static int[] nextPermutation(int[] nums) {
		int max = 0;
		int position = 0;
		for(int i = nums.length - 1; i >= 0; i--){
			if(nums[i] < max){
				int po = 0;
				for(int j = nums.length-1; j > i; j--){
					if(nums[j] > nums[i] && nums[j] <= max){
						max = nums[j];
						po = j;
					}
				}
				max = nums[i];
				nums[i] = nums[po];
				nums[po] = max;
				position = i + 1;	
				break;
			}
			max  = nums[i];
		}
		Arrays.sort(nums, position, nums.length);
		return nums; 
    }
	
	
	
	
	
}
