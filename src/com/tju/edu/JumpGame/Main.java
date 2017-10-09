package com.tju.edu.JumpGame;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {3,2,1,0,4};
		System.out.println(canJump(height));
	}

	
	public static boolean canJump(int[] nums) {
		int n  = nums.length - 1;
		for(int i = n - 1; i >= 0; i-- ){
			if(nums[i] >= n - i)n = i;
		}
		if(n != 0)return false;
		return true;     
	}
}
