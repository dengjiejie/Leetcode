package com.tju.edu.SearchInsertPosition;

import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {};
		System.out.println(Arrays.toString(searchRange(height,4)));
	}

	//三种情况     中间值属于前段，中间值属于后段，整个数组正常
	
	public static int[] searchRange(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		int mid = -1;
		int[] num = {-1,-1};
		while (left <= right) {
			mid = (left + right) / 2;
			if(nums[mid] == target){
				int i  = mid ;
				int j  = mid ;
				while (i - 1 >= 0 && nums[i - 1] == target) {
					i--;
				}
				while (j + 1 < nums.length && nums[j + 1] == target) {
					j++;
				}
				num[0] = i;
				num[1] = j;
				break;
			}
			if( target < nums[mid]){
				right = mid - 1;
				continue;
			}else {
				left = mid + 1;
				continue;
			}
		}
		return num;
    }
	
	
}
