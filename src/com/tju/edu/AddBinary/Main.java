package com.tju.edu.AddBinary;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("111","11"));
	}
	
	 public static String addBinary(String a, String b) {
	        int m = a.length();
	        int n = b.length();
	        boolean point = false;
	        int num = 0;
	        StringBuilder sb = new StringBuilder();
	        for(int i = 1; i <= m || i <= n; i++){
             
	            num = 0;
             
	            if(point)num++;
             
	            if( m-i >= 0 && a.charAt(m-i) == '1')num++;
	            
	            if( n-i >= 0 && b.charAt(n-i) == '1') num++;
	            
	            point = num > 1 ? true : false;
	           
	            sb.append(num%2);
	               
	        }
	        if(point) sb.append(1);;
	        
	        return sb.reverse().toString();
	    }
}
