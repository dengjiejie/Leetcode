package com.tju.edu.SpiralMatrixII;

import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;			
		System.out.println(Arrays.asList(generateMatrix(n)));
		
		
		
		
		
		
	}
	
	 public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1;
		for(int i = 0; i <= (n-1)/2; i++){
			int j = i;
			int k = i;
			while (k + i < n ) {
				matrix[j][k] = num++;
				k++;
			}
			k--;
			j++;
			while (j + i < n ) {
				matrix[j][k] = num++;
				j++;
			}
			j--;
			k--;
			while (k >= i  ) {
				matrix[j][k] = num++;
				k--;
			}
			k++;
			j--;
			while (j > i  ) {
				matrix[j][k] = num++;
				j--;
			}
		}
		return matrix;
    }
	
	
}
