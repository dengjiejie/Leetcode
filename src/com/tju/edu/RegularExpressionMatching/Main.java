package com.tju.edu.RegularExpressionMatching;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.out.println(isMatch("aaaaaaaaaaaaab","a*a*a*a*a*a*a*a*a*a*c"));
//		System.out.println(isMatch("aa","aa"));
//
//		System.out.println(isMatch("aaa","aa"));
//
//		System.out.println(isMatch("aa", "a*"));
//
//		System.out.println(isMatch("aa", ".*") );
//		System.out.println(isMatch("ab", ".*") );
//		System.out.println(isMatch("aab", "c*a*b")  );
//		
	}
//  运行时间太长
//	public static boolean isMatch(String s, String p) {
//		if(p.isEmpty())return s.isEmpty();
//		if(p.length() == 1 ){
//			return s.length() == 1 &&((p.charAt(0) == s.charAt(0)) || p.charAt(0) == '.');
//		}
//		if( p.charAt(1) == '*'){
//			if(!s.isEmpty() &&( p.charAt(0) == s.charAt(0)|| p.charAt(0) == '.'))
//				return isMatch(s.substring(1), p)||isMatch(s.substring(1), p.substring(2)) || isMatch(s, p.substring(2));
//			else {
//				return isMatch(s, p.substring(2));
//			}
//		}	
//		if(s.isEmpty())return false;
//		if(p.charAt(0) == s.charAt(0)|| p.charAt(0) == '.') return isMatch(s.substring(1), p.substring(1));
//		return false;
//    }
	
	
	
	
	
}
