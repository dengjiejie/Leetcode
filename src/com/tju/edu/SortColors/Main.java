package com.tju.edu.SortColors;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void sortColors(int[] nums) {
        int leftPoint = 0;
        int left = 0;
        int right = nums.length-1;
        
        while (leftPoint <= right) {
        	if(nums[leftPoint] == 0){
        		swap(nums, left, leftPoint);
        		left++;
        		leftPoint++;
        	}else if(nums[leftPoint] == 2){
        		swap(nums, right, leftPoint);
        		right--;
        	}else {
        		leftPoint++;
			}
		}
    }
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	
}
