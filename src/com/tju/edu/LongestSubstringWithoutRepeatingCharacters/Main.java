package com.tju.edu.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "a";
		
		System.out.println(lengthOfLongestSubstring(string));
		
		
		
	}
	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		for(int i = 0, j = -1; i < s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				if(map.get(s.charAt(i))> j){
					j = map.get(s.charAt(i));
				}
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-j);
		}
		return max;   
	}
//和上面的算法都一样，这里的start就是上面的j，是可以直接用map来的到的；
//	public static int lengthOfLongestSubstring(String s) {
//		int start = -1;
//		int end = 0;
//		int max = 0;
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		while(end < s.length()){
//			if(map.containsKey(s.charAt(end))&&map.get(s.charAt(end)) > start){
//				start++;
//				while(s.charAt(start)!= s.charAt(end)){
//					start++;
//				}
//			}
//			map.put(s.charAt(end), end);
//			max = Math.max(max,end-start);
//
//			end++;
//		}
//		return max;
//	}

}
