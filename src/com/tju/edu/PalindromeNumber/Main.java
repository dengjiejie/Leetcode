package com.tju.edu.PalindromeNumber;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(90109));
	}
	public static boolean isPalindrome(int x) {
	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
//	public static boolean isPalindrome(int x) {
//		int lastnum = 0;
//		int firstnum = 0;
//		if(x < 0)return false;
//		int i = 0;
//		int j = 0;
//		while(x >= 10 ){
//			lastnum = x % 10;
//			firstnum = x / 10;
//			x /= 10;
//			while(firstnum >= 10){
//				firstnum /= 10;
//				i++;
//			}
//			if(lastnum != firstnum) return false;
//			firstnum = x % (int)Math.pow(10, i);
//			x = firstnum;
//			if(x == 0)return true;
//			while(firstnum > 0){
//				firstnum /= 10;
//				j++;
//			}
//			if(i != j){
//				j = i  -j;
//				i = 0;
//				while (x % 10 == 0) {
//					x /= 10;
//					i++;
//					
//				}
//				if(i !=j )return false;
//			}
//			j = 0;
//			i = 0;
//		}
//		return true;
//    }
	
	
}
