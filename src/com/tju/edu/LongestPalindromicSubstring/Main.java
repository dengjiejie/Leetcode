package com.tju.edu.LongestPalindromicSubstring;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ccc";
		System.out.println(longestPalindrome(string));
	}

	public static String longestPalindrome(String s) {
		String string = "";
		for(int i = 0; i < s.length(); i++){
			string = findSub(i-1, i+1, s,string);
			String string2 = findSub(i, i+1, s,string);
			string = string.length() > string2.length()?string : string2;
		}
		return string; 
    }
	
	public static String findSub(int left, int right, String s, String string) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
			left--;
			right++;
		}
		if((right - left - 1) > string.length()){
			string = s.substring(left+1,right);
		}
		return string;
	}
	
	
}
