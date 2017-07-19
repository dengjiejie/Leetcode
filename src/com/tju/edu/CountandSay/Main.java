package com.tju.edu.CountandSay;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(6));
	}
	public static String countAndSay(int n) {
		String nthString = "1";
		StringBuilder ithString = new StringBuilder();
		for(int i = 1; i < n; i++){
			ithString = new StringBuilder();
			int j = 1;
			int num = 1;
			while (j < nthString.length()) {
				if(nthString.charAt(j-1) == nthString.charAt(j)){
					num++;
				}else {
					ithString.append(num);
					ithString.append(nthString.charAt(j-1));
					num = 1;
				}
				j++;
			}
			ithString.append(num);
			ithString.append(nthString.charAt(j-1));
			nthString = ithString.toString();
		}
		return nthString;
    }
	
	
}
