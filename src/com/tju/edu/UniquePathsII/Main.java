package com.tju.edu.UniquePathsII;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] height = {{0},{1}};
		System.out.println(uniquePathsWithObstacles(height));
	}
	
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int[][] path  = new int[obstacleGrid.length][obstacleGrid[0].length];
		if(obstacleGrid[0][0] == 1)return 0;
		path[0][0] = 1;
		for(int i =0; i < obstacleGrid.length; i++ ){
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if(obstacleGrid[i][j] == 1)continue;
				if( i-1 >= 0 )
					path[i][j] +=  path[i-1][j];
				if( j-1 >= 0 )
					path[i][j] +=  path[i][j-1];
			}
		}		
		return path[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
