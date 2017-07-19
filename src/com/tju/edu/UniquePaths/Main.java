package com.tju.edu.UniquePaths;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(4,6));
	}
//	public static int uniquePaths(int m, int n) {
//		n = m + n -2;
//		double result = 1;
//		while(--m>0){
//			result = result*(n--)/m;
//		}
//		return (int)Math.round(result);
//	}
	
	public static int uniquePaths(int m, int n) {
		int[][] path  = new int[m][n];
		path[0][0] = 1;
		for(int i =0; i < m; i++ ){
			for (int j = 0; j < n; j++) {
				if( i-1 >= 0 )
					path[i][j] +=  path[i-1][j];
				if( j-1 >= 0 )
					path[i][j] +=  path[i][j-1];
			}
		}		
		return path[m-1][n-1];
	}
	
	
	
	
	

	
	
	
	
	
	
}
