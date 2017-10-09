package com.tju.edu.RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(restoreIpAddresses("010010"));
	}
	
	
	public static List<String> restoreIpAddresses(String s) {
		List<String> list = new ArrayList<String>();

		String subAddress = "";
		helper(list,subAddress, s, 12);
		return list;   
	}
	
	public static void  helper(List<String> list,String subAddress, String s, int len ) {
		if(s.isEmpty() || s.length() > len || len < 3 )return;
		if(len == 3){
			if(Integer.parseInt(s) < 256 ){
				if(s.charAt(0) == '0' && s.length() > 1)return;
				list.add((subAddress+"."+s).substring(1));
			}
			return;
		}
		int i = 1;
		String string = s.substring(0,i);
		while (Integer.parseInt(string) < 256) {
			
			helper(list,subAddress+"."+string, s.substring(i),len - 3);
			i++;
			if(i >= s.length())break;
			
			string = s.substring(0,i);	
			if(string.charAt(0) == '0')break;
		}
		return;
	}
}
