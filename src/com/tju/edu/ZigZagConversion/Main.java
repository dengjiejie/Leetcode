package com.tju.edu.ZigZagConversion;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "PAYPALISHIRING";
		System.out.println(convert(string, 3));
	}
	
	
	public static String convert(String s, int numRows) {
		if(numRows == 1){
			return s;
		}
		StringBuffer[] strings = new StringBuffer[numRows];
		for(int i = 0; i < numRows; i++){
			strings[i] = new StringBuffer();
		}
		int tag = 0;
		String string = "";
		int position = 0;
		for(int i = 0; i < s.length(); i++){
			strings[position].append(s.charAt(i));
			if(tag == 0){
				position++;
			}else {
				position--;
			}
			if(position == numRows-1){
				tag = 1;;
			}else if(position == 0 ) {
				tag = 0;
			}
		}
		for(int i = 0; i < numRows; i++){
			string += strings[i];
		}
		return string;
    }
	
	
	
	
	
}
