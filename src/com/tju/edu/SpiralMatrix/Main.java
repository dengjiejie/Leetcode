package com.tju.edu.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] height = {	{2,5,8},{4,0,-1}
									};
		System.out.println(spiralOrder(height));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		int len = matrix.length;
		if (len == 0) {
			return list;
		}
		int leny = matrix[0].length;
		int loop = (Math.min(len, leny)-1)/2;
		
		for(int i = 0; i <= loop; i++){
			int j = i;
			int k = i;
			while (k + i < leny ) {
				list.add(matrix[j][k]);
				k++;
			}
			k--;
			j++;
			if(j + i == len) break;
			while (j + i < len ) {
				list.add(matrix[j][k]);			
				j++;
			}
			j--;
			k--;
			if(k == i - 1) break;
			while (k >= i  ) {
				list.add(matrix[j][k]);				
				k--;
			}
			k++;
			j--;
			while (j > i  ) {
				list.add(matrix[j][k]);
				j--;
			}
		}
		return list;
    }
	
	
}
