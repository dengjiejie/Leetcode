package com.tju.edu.JumpGame;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(height));
	}

	
	public static int maxSubArray(int[] nums) {
		if(nums==null || nums.length==0)  
	        return 0;  
	    int global = nums[0];  
	    int local = nums[0];  
	    for(int i=1;i<nums.length;i++)  
	    {  
	        local = Math.max(nums[i],local+nums[i]); // 怎么找局部最大
	        global = Math.max(local,global);  
	    }  
	    return global;  
    }
}
