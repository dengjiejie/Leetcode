package com.tju.edu.MedianOfTwoSortedArrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2};
		int[] nums2 = {3,4,5,6,8};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
/**********************时间复杂度为O(M+N),直接将两个数组合并,可以直接找出第k小的数*********************************/
//	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//		int m = nums1.length, n = nums2.length;
//		int[] num = new int[m+n];
//		int i = 0;
//		int j = 0;
//		int p = 0;
//		while (i < m && j < n) {
//			if(nums1[i] < nums2[j])
//				num[p++] = nums1[i++];
//			else num[p++] = nums2[j++];
//		}
//		if(i == m){
//			while (j < n ) {
//				num[p++] = nums2[j++];
//			}
//		}
//		else {
//			while (i < m ) {
//				num[p++] = nums1[i++];
//			}
//		}
//		int k = (m + n) / 2; 
//		if((m+n)%2 == 0){
//			return (num[k] + num[k-1])/2.0;			
//		}else {
//			return num[k];
//		}
//    }
	
	
	
	
	
	
	/*********************时间复杂度为O(LOG(M+N))**********************/
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] A = nums1.length > nums2.length ? nums2 : nums1;
    	int[] B = nums1.length > nums2.length ? nums1 : nums2;
    	int m = A.length;
    	int n = B.length;
		int imin = 0;
		int imax = m;
		int half_len = ( n + m + 1 ) / 2;
		int i, j;
		int max_of_left = 0, min_of_right = 0;
		while (imin <= imax) {
			i = ( imin + imax ) / 2;
			j = half_len - i;
			if(i < m && A[i] < B[j-1]){
				imin = i + 1;
			}else if (i > 0 && A[i-1] > B[j]) {
				imax = i - 1;
			}else {
				if(i == 0) max_of_left = B[j-1];
				else if(j == 0) max_of_left = A[i-1];
				else max_of_left = Math.max(A[i-1], B[j-1]);
				
				if(( m + n ) % 2 != 0) return max_of_left;
				
				if(i == m ) min_of_right = B[j];
				else if ( j == n ) min_of_right = A[i];
				else min_of_right = Math.min(A[i], B[j]);
				
				return (max_of_left + min_of_right) / 2.0;
			}
		}
		return 0;
    }
}
