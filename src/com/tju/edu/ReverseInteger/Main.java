package com.tju.edu.ReverseInteger;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse(77));
	}
	public static int reverse(int x) {
	       String string = String.valueOf(Math.abs(x));
			StringBuffer s = new StringBuffer();
			s.append(x >= 0?"":"-");
			for(int i = string.length()-1; i >= 0; i--){
				s.append(string.charAt(i));
			}
			try {
				string = String.valueOf(s);
				x = Integer.parseInt(string);
			} catch (Exception e) {
				return 0;
			}
			return x;
	    }
	
}
