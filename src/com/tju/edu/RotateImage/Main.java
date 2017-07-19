package com.tju.edu.RotateImage;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2},{3,4}};
		rotate(matrix);
		
	}
	
	
	public static void rotate(int[][] matrix) {
        int len = matrix.length;
        int ai,aj,temp,temp1;
		for(int i = 0; i < len/2; i++){
			for(int j = i; j < len -i-1; j++){
				ai = j;
				aj = len - i -1;
				temp = matrix[i][j];
				while(ai != i || aj != j ){
					System.out.println(temp);
					temp1 = matrix[ai][aj];
					matrix[ai][aj] = temp;
					temp = temp1;
					temp1 = ai ;
					ai = aj;
					aj = len - temp1 -1;
				}
				matrix[i][j] = temp;
			}
		}
		for(int i  = 0; i < len; i++){
			for(int k = 0; k < len ; k++){
				System.out.print(matrix[i][k] + " ");
				
			}
			System.out.println();
		}
		
		
		
    }
	
}