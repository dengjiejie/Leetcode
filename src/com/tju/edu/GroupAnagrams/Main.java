package com.tju.edu.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] height = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(height));
	}
	public static List<List<String>> groupAnagrams(String[] strs) {   
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		int len = strs.length;
		String string = " ";
		for(int i =0; i < len; i++){
			char[] str = strs[i].toCharArray();
			Arrays.sort(str);
			string = String.valueOf(str);
			if(map.containsKey(string)){
				map.get(string).add(strs[i]);
			}else {
				List<String> listsStrings = new ArrayList<String>();
				listsStrings.add(strs[i]);
				map.put(string, listsStrings);
			}
		}
		return new ArrayList<List<String>>(map.values()); 
	}
}
