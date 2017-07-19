package com.tju.edu.SetMatrixZeroes;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setZeroes(int[][] matrix) {
		int lenX = matrix.length;
		int lenY = matrix[0].length;
		
		int[] X = new int[lenX];
		int[] Y = new int[lenY];
		
		for(int i = 0; i < lenX; i++){
			for(int j = 0; j < lenY; j++){
				if(matrix[i][j] == 0){
					X[i] = 1;
					Y[j] = 1;
				}
			}
		}
		
		for(int i  = 0; i < lenX; i++){
			if(X[i] == 1){
				for(int j = 0; j < lenY; j++ ){
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int i  = 0; i < lenY; i++){
			if(Y[i] == 1){
				for(int j = 0; j < lenX; j++ ){
					matrix[j][i] = 0;
				}
			}
		}
	}
	
	
	
}
