package com.tju.edu.RomantoInteger;

import java.util.HashMap;
import java.util.Map;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("DCXXI"));
	}
	
	public static int romanToInt(String s) {
		int total = 0;
	    Map<Character, Integer> map = new HashMap<Character, Integer>();
	    map.put('M', 1000);
	    map.put('D', 500);
	    map.put('C', 100);
	    map.put('L', 50);
	    map.put('X', 10);
	    map.put('V', 5);
	    map.put('I', 1);
	    total += map.get(s.charAt(s.length()-1));
		for(int i =s.length() - 2; i >= 0; i-- ){
			if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
			    total += map.get(s.charAt(i));
			}else {
			    total -= map.get(s.charAt(i));
			}
		}
		return total;   
	}
	
	
}
