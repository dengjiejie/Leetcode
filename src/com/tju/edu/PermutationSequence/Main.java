package com.tju.edu.PermutationSequence;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(3,2));
	}
	
	public static String getPermutation(int n, int k) {
		StringBuffer stringBuffer = new StringBuffer();
		int subnum = 1;
		for (int i = 1; i <= n; i++) {
			stringBuffer.append(i);
			subnum *= i;
		}
		String string = stringBuffer.toString();
		StringBuffer newstringBuffer = new StringBuffer();
		int len = 0;
		while (true) {
			len = string.length();
			if(k == 1 || len == 1 ){
				newstringBuffer.append(string);
				break;
			}
			
			subnum /= len; 
			
			len = (k-1) / subnum;//??????
			newstringBuffer.append(string.charAt(len));
			string = string.substring(0,len) + string.substring(len+1);
			k -= subnum * len;
		}
		return newstringBuffer.toString(); 
    }
	


}
