package com.tju.edu.GrayCode;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(grayCode(4));
	}
	
	
	
	public static List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int size;
		for(int i = 1; i < n; i++){
			size = list.size();
			for(int j = size-1; j >=0; j--){
				list.add(list.get(j)+(int)Math.pow(2, i));
			}
		}
		
		return list;
    }
	
	
//	public static List<Integer> grayCode(int n) {
//	    List<Integer> list = new ArrayList<Integer>();
//	    for (int i = 0; i < 1<<n; i++){
//	    	list.add(i ^ i>>1);
//	    }
//	    return list;
//	}
	
}
