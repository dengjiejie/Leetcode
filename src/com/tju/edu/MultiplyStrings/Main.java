package com.tju.edu.MultiplyStrings;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply("0", "0"));
	}
	public static String multiply(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		int[] num = new int[len1+len2];
		for(int i = len1 - 1 ; i >= 0; i-- ){
			for(int j = len2 - 1 ; j >= 0; j-- ){
				num[i+j+1] += Character.getNumericValue(num1.charAt(i))* Character.getNumericValue(num2.charAt(j));
			}
		} 
		int carry = 0;
		String string = "";
		for(int i  = len1 + len2 -1; i >= 0; i--){
			num[i] += carry;
			carry = num[i] / 10;
			num[i] %= 10;
			string = num[i] + string;
		}
		while (string.charAt(0) == '0' && string.length() > 1) {
			string = string.substring(1);
		}
		return string;
	}
	
	
}
