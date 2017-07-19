package com.tju.edu.ImplementstrStr;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.nanoTime();  

		System.out.println(strStr("qwert","ert"));

		long endTime=System.nanoTime(); 

		System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 

	}
	//needle为子串
	public static int strStr(String haystack, String needle) {
		if(haystack.length() < needle.length())return -1;
		if(needle.length() == 0)return 0;
		int len  = haystack.length() - needle.length() + 1;
		for(int i = 0; i < len; i++){
			int j = i;
			int k = 0;
			while (haystack.charAt(j) == needle.charAt(k)) {
				j++;
				k++;
				if(k == needle.length())return i;	
			}
		}
		return -1;
	}
	
	
	
	
	
}
