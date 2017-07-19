package com.tju.edu.ContainerWithMostWater;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,3,4,1,5,1};
		System.out.println(maxArea(height));
	}

	
	public static int maxArea(int[] height) {
		int maxarea = -1;
		int area;
		int xleft = 0 , xright = height.length;
		while(xleft < xright){
			area = Math.min(height[xleft], height[xright]) * (xright - xleft);
			maxarea = Math.max(maxarea, area); 
			if(height[xleft] < height[xright]){
				xleft++;
			}else {
				xright--;
			}
		}
		return maxarea;
    }
//	public static int maxArea(int[] height) {
//		int maxarea = -1;
//		int xlength;
//		int yheigth;
//		int area;
//		for(int i =0; i < height.length; i++){
//			for(int j = i + 1; j < height.length; j++){
//				xlength = j - i;
//				yheigth = height[i] < height[j] ? height[i] : height[j];  
//				area = xlength * yheigth;
//				maxarea = maxarea > area ? maxarea : area;
//			}
//		}
//		return maxarea;
//    }
	
}
