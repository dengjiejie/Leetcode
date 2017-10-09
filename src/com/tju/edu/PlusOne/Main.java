package com.tju.edu.PlusOne;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[] haha = {0};
		System.out.println(plusOne(haha)[0]);
	}
	
	 public static int[] plusOne(int[] digits) {
	        int point = digits.length;
	        while(point>0){
	            point--;
	            if(digits[point]+1 <= 9){
	                digits[point]+=1;
	                break;
	            }
	            digits[point]=0;
	        }
	        if(digits[0] == 0){
	            int[] newDigits = new int[digits.length+1];
	            newDigits[0] = 1;
	            return newDigits;
	        }
	        return digits;
	    }		
}
