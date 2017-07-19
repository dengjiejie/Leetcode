package com.tju.edu.SearchinRotatedSortedArray;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {4,5,1,2,3};
		System.out.println(search(height,9));
	}

	//三种情况     中间值属于前段，中间值属于后段，整个数组正常
	
	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int mid = -1;
		while (left <= right) {
			mid = (left + right) / 2;
			if(nums[mid] == target) return mid;
			if(nums[mid] >= nums[left]){
				if(target >= nums[left] && target < nums[mid]){
					right = mid - 1;
				}else {
					left = mid + 1;
				}
				continue;
			}else {
				if(target <= nums[right] && target > nums[mid]){
					left = mid + 1;
				}else {
					right = mid - 1;
				}
				continue;
			}
		}
		return -1;
    }
	
	
}
