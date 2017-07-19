package com.tju.edu.RemoveElement;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {};
		
		long startTime=System.nanoTime();  

		System.out.println(removeElement(height,1));

		long endTime=System.nanoTime(); 

		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
	
	
	public static int removeElement(int[] nums, int val) {
		int num = 0;
		for(int i = 0; i < nums.length; i++ ){
			if(nums[i] != val){
				nums[num] = nums[i];
				num++;
			}
		}
		
		return num;       
	}
	
	
	
}
