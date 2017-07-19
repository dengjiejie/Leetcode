package com.tju.edu.RemoveDuplicatesfromSortedArray;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,3,4,1,5,1};
		
		long startTime=System.nanoTime();  

		System.out.println(removeDuplicates(height));

		long endTime=System.nanoTime(); 

		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
	
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length < 2) return nums.length;
		int num = 1;
		for(int i = 1; i < nums.length; i++ ){
			if(nums[i] != nums[i-1]){
				nums[num] = nums[i];
				num++;
			}
		}
		return num;       
	}
	
	
	
}
