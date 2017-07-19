package com.tju.edu.TOP10.SingleElementinaSortedArray;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {3,3,7,7,10,10,11};
		System.out.println(singleNonDuplicate(height));
	}

	public static int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length;
		int mid,midgo;
		while(start != end){
			mid = (start + end) / 2;
			if(mid + 1 < nums.length && nums[mid] == nums[mid+1]){
				midgo = mid;
				mid++;
			}else if(mid - 1>= 0 && nums[mid] == nums[mid-1]){
				midgo = mid - 1;
			}else {
				return nums[mid];
			}
			if((midgo - start)% 2 != 0){
				end = midgo - 1;
				continue;
			}else{
				start = mid + 1;
				continue;
			}
		}
		return nums[start];    
	}
	
}
