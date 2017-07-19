package com.tju.edu.IntegertoRoman;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(3999));
	}
	public  static String intToRoman(int num) {
		//int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    //String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuffer stringBuffer = new StringBuffer();
//方法一   采取减的方式
//		for(int i=0;i<values.length;i++) {
//	        while(num >= values[i]) {
//	            num -= values[i];
//	            stringBuffer.append(strs[i]);
//	        }
//	    }
		
		
//方法二
//		int size = num / 1000;
//		int remainder = num % 1000;
//		stringBuffer = addBuffer(stringBuffer, "M" , size);
//		
//		size = remainder / 900;
//		remainder = remainder % 900;
//		stringBuffer = addBuffer(stringBuffer, "CM" , size);
//		
//		size = remainder / 500;
//		remainder = remainder % 500;
//		stringBuffer = addBuffer(stringBuffer, "D" , size);
//		
//		size = remainder / 400;
//		remainder = remainder % 400;
//		stringBuffer = addBuffer(stringBuffer, "CD" , size);
//		
//		size = remainder / 100;
//		remainder = remainder % 100;
//		stringBuffer = addBuffer(stringBuffer, "C" , size);
//
//		size = remainder / 90;
//		remainder = remainder % 90;
//		stringBuffer = addBuffer(stringBuffer, "XC" , size);
//		
//		size = remainder / 50;
//		remainder = remainder % 50;
//		stringBuffer = addBuffer(stringBuffer, "L" , size);
//		
//		size = remainder / 40;
//		remainder = remainder % 40;
//		stringBuffer = addBuffer(stringBuffer, "XL" , size);
//		
//		size = remainder / 10;
//		remainder = remainder % 10;
//		stringBuffer = addBuffer(stringBuffer, "X" , size);
//		
//		size = remainder / 9;
//		remainder = remainder % 9;
//		stringBuffer = addBuffer(stringBuffer, "IX" , size);
//		
//		size = remainder / 5;
//		remainder = remainder % 5;
//		stringBuffer = addBuffer(stringBuffer, "V" , size);
//		
//		size = remainder / 4;
//		remainder = remainder % 4;
//		stringBuffer = addBuffer(stringBuffer, "IV" , size);
//		stringBuffer = addBuffer(stringBuffer, "I" , remainder);
		return stringBuffer.toString();      
	}
	public static StringBuffer addBuffer(StringBuffer stringBuffer, String string, int size ) {
		while(size > 0){
			stringBuffer.append(string);
			size--;
		}
		return stringBuffer;
	}
	
}
