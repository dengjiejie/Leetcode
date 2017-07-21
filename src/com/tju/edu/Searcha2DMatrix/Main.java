package com.tju.edu.Searcha2DMatrix;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

//	public boolean searchMatrix(int[][] matrix, int target) {
//	      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
//		    return false;
//	        
//	      int m = matrix.length, n = matrix[0].length;
//		  int low = 0, high = n * m - 1;
//		  while (low <= high) {
//		    int mid = (low + high) / 2;
//		    if (matrix[mid / n][mid % n] == target) {
//		      return true;
//		    } else if (matrix[mid / n][mid % n] < target) {
//		      low = mid + 1;
//		    } else {
//		      high = mid - 1;
//		    }
//		  }
//		  return false;
//	}
	
	
	public boolean searchMatrix(int[][] matrix, int target) {
		int x = matrix.length;
		if(x == 0)return false;
		int y = matrix[0].length;
		if(y == 0)return false;
		if(matrix[0][0] > target || matrix[x-1][y-1] < target)return false;
		int right = 0;
		int left = x-1;
		int mid;
		while (right < left) {
			mid  = right+left;
			mid /= 2;
			if(matrix[mid][0] == target){
				return true;
			}else if (matrix[mid][0] > target ) {
				left = mid - 1;
			}else {
				if(right == mid){
					if(matrix[mid+1][0] > target){
						right = mid;
					}else {
						right = mid+1;
					}
					break;
				}else {
					right = mid;
				}
			}
		}
		int poX = right;
		right = 0;
		left = y-1;
		while (right <= left) {
			mid  = right+left;
			mid /= 2;
			if(matrix[poX][mid] == target){
				return true;
			}else if (matrix[poX][mid] > target) {
				left = mid - 1;
			}else {
				right = mid + 1;
			}
		}
		return false; 
    }
	
	
	
	public boolean haha(int[][] matrix, int target) {
		int x = matrix.length;
		if(x == 0)return false;
		int y = matrix[0].length;
		if(y == 0)return false;
		if(matrix[0][0] > target || matrix[x-1][y-1] < target)return false;
		for(int i =0; i < x; i++){
			for(int j =0; j < y; j++){
				if(matrix[i][j] == target){
					return true;
				}
			}
		}
		return false; 
    }
	
	
	
	
	
	
	
}
