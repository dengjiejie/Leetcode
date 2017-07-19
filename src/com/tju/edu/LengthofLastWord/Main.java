package com.tju.edu.LengthofLastWord;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("a"));
	}
	
	
	
	public static int lengthOfLastWord(String s) {
		
		int len = 0;
		int leng = s.length() - 1;
		while (leng >= 0 && s.charAt(leng) == ' ')leng--;
		if(leng < 0)return 0;
		while(leng >= 0 && s.charAt(leng) != ' '){
			len++;
			leng--;
		}
		return len;
	}
	

	
}
