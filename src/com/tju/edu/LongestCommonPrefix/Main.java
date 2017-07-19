package com.tju.edu.LongestCommonPrefix;




public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"aa","a","aa"};
		System.out.println(longestCommonPrefix(strings));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0 )return "";
		String reString = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(reString) != 0){
				reString = reString.substring(0,reString.length()-1);
			}
		}
		return reString;
    }
	
	
}
