package com.tju.edu.LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = "290";
		System.out.println(letterCombinations(height));
		System.out.println("ssss");
	}

	public static List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
		String[] map = new String[10];
		map[0] = "";
		map[1] = "";
		map[2] = "abc";
		map[3] = "def";
		map[4] = "ghi";
		map[5] = "jkl";
		map[6] = "mno";
		map[7] = "pqrs";
		map[8] = "tuv";
		map[9] = "wxyz";
		digits = digits.replace("0", "");
		digits = digits.replace("1", "");
		int len = digits.length();
		int[] position = new int[len];
		String[] digitsStrings = new String[len];
		for(int i = 0; i < len; i++){
			digitsStrings[i] = map[Integer.parseInt(String.valueOf(digits.charAt(i)))];
		}
		int xpo = 0;
		StringBuffer outString = new StringBuffer(); 
		while (len > 0 ) {
			while(xpo < len-1){
				outString.append(digitsStrings[xpo].charAt(position[xpo]));
				xpo++;
			}
			outString.append(digitsStrings[xpo].charAt(position[xpo]));
			list.add(outString.toString());
			position[xpo]++;
			while (position[xpo] == digitsStrings[xpo].length()) {
				position[xpo] = 0;
				xpo--;
				if(xpo < 0)return list;
				position[xpo]++;
			}
			outString.delete(xpo,outString.length());
		}
		return list;    
	}

}
