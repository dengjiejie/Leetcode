package com.tju.edu.GenerateParentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 3;
		System.out.println(generateParenthesis(height));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
//		for(String string : generate(n)){
//			list.add(string);
//		}
		generate( n, n, new String(), list);
		helper( n, n, new String(), list);

		return list;
    }
	public static void  generate(int leftNum,int rightNum,String s,List<String> result)  
    {  
        if(leftNum==0&&rightNum==0)  
        {  
            result.add(s);  
        }  
        if(leftNum>0)  
        {  
            generate(leftNum-1,rightNum,s+'(',result);  //使用string 可以不用想StringBuilder一样再去消除
        }  
        if(rightNum>0&&leftNum<rightNum)  
        {  
            generate(leftNum,rightNum-1,s+')',result);  
        }  
    }
	
	
	
	private static void helper(int open, int close, String strb, List<String> result) {
        if(open==0 && close==0) {
            result.add(strb.toString());
            return;
        }
        
        if(open>0) {
            helper( open-1, close, strb+"(", result);
        }
        if(open<close) {
            helper( open, close-1, strb+(")"), result);
        }
    }
	
	
	
	
	
	public static Set<String> generate(int n) {
		Set<String> set = new HashSet<String>();

		if(n == 1 ){
			set.add("()");
			return set;
		}
		for(String string : generate(n - 1)){
			set.add("(" + string+")");
			set.add(string +"()");
			set.add("()" + string);
		}
		int i = 2;
		int j = n-2;
		while (i <= j) {				
			for(String string : generate(i)){
				for(String string2: generate(j)){
					set.add(string2 + string);
					set.add(string + string2);
				}
			}	
			i++;
			j--;
		}
		return set;
    }
	
}
