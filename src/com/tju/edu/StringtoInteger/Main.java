package com.tju.edu.StringtoInteger;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "     -543434345454564";
		System.out.println( myAtoi(string));
		
		
		
	}

	public static int myAtoi(String str) {
		if(str.isEmpty())return 0;
		String string = "1234567890";
		String s = "";
		int num = 0;
		while(str.charAt(0) == ' '){
			str = str.substring(1);
		}
		if("-+".contains(String.valueOf(str.charAt(0)))){
		    s += str.charAt(0);
		    str = str.substring(1);
		}
		for(int i = 0; i < str.length(); i++){
			if(string.contains(String.valueOf(str.charAt(i)))){
				s += str.charAt(i);
			}else break;
		}
		try {
			num = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			if(s.length() > 2){
				if(Integer.parseInt(s.substring(0,2)) < 0){
					return -2147483648;
				}else {return 2147483647;}
			}else return 0;
		}
		return num;    
	}
	
	
}
