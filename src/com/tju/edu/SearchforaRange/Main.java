package com.tju.edu.SearchforaRange;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,3,4,5,7};
		System.out.println((searchInsert(height,8)));
	}

	//�������     �м�ֵ����ǰ�Σ��м�ֵ���ں�Σ�������������
	
	public static int searchInsert(int[] nums, int target) {
		
		int left = 0;
		int right = nums.length-1;
		int mid = -1;
		while (left <= right) {
			mid = (left + right) / 2;
			if(nums[mid] == target){
				return mid;
			}
			if( target < nums[mid]){
				right = mid - 1;
				continue;
			}else {
				left = mid + 1;
				continue;
			}
		}
		return (target > nums[mid]) ? ++mid : mid;
    }
	
	
}
