package com.tju.edu.Pow;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2,-3));
	}

	
	public static double myPow(double x, int n) {
		if(n == 0)return 1;
		double num = myPow(x, n/2);
		if(n % 2 == 0){
			return num * num;
		}else {
			if(n > 0)
	            return x*num*num;
	        else
	            return (num*num)/x;
		}
    }
}
