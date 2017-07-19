package com.tju.edu.ddd;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(numDecodings("1111"));
	}

	public static int numDecodings(String s) {		
		if(s.isEmpty())return 0;
		int len = s.length();
		int[] map = new int[len+1];
		map[0] = 1;
		for(int i = 0; i < len; i++){
			if(s.charAt(i) == '0'){
				continue;
			}
			map[i+1] += map[i];
			if(i + 2 <= len && Integer.parseInt(s.substring(i,i+2)) < 27){
				map[i+2] += map[i];
			}
		}
		return map[len];
	}
	
	
//	public static int numDecodings(String s) {		
//		if(s.isEmpty())return 0;
//		return helper(s);
//	}  
//	public static int helper(String s) {
//		if(!s.isEmpty() && s.charAt(0) == '0'){
//			return 0;
//		}
//		if(s.length() < 2)return 1;
//		int num1 = 0 ;
//
//		if(Integer.parseInt(s.substring(0,2)) < 27 ){
//			num1 = helper(s.substring(2));
//		}
//		return num1 + helper(s.substring(1));
//	}
	
}
