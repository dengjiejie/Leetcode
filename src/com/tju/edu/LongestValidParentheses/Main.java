package com.tju.edu.LongestValidParentheses;

import java.util.LinkedList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestValidParentheses(")(((((()())()()))()(()()))())()()))()(()))("));
		System.out.println("dddd");
	}
	
//	public static int longestValidParentheses(String s) {
//        Stack<Integer> stack = new Stack<Integer>();
//        int max=0;
//        int left = -1;
//        for(int j=0;j<s.length();j++){
//            if(s.charAt(j)=='(') stack.push(j);            
//            else {
//                if (stack.isEmpty()) left=j;
//                else{
//                    stack.pop();
//                    if(stack.isEmpty()) max=Math.max(max,j-left);
//                    else max=Math.max(max,j-stack.peek());
//                }
//            }
//        }
//        return max;
//    }
	
	
	public static int longestValidParentheses(String s) {
	if(s.length() < 2 )return 0;
	LinkedList<Character> stack = new LinkedList<Character>();
	int length = 0;
	for(int i = 0; s.length() - i > length; i++){
		stack.addFirst(s.charAt(i));
		int j = i + 1;
		int num = 0;
		
		if(num == 0 && length < j - i - stack.size())
			length = j - i - stack.size();
		if(length < num)
			length  = num;
	}
	return length;  
}
	
//	public static int longestValidParentheses(String s) {
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i < s.length(); i++){
//			if(s.charAt(i) == '('){
//				a++;
//			}
//			else {
//				b++;
//			}
//		}
//		return longest(s, a, b);	
//	}
//	
//	public static int longest(String s, int a, int b ) {
//		if(s.length() < 2 ) return 0;
//		if(a != b){
//			return Math.max(longest(s.substring(1),s.charAt(0) == '(' ? a-1 : a,s.charAt(0) == ')' ? b-1 : b), 
//					longest(s.substring(0,s.length()-1),s.charAt(s.length()-1) == '(' ? a-1 : a,s.charAt(s.length()-1) == ')' ? b-1 : b));
//		}
//		if( s.charAt(0) == ')'){
//			return longest(s.substring(1),s.charAt(0) == '(' ? a-1 : a,s.charAt(0) == ')' ? b-1 : b);
//		}
//		if( s.charAt(s.length()-1) == '('){
//			return longest(s.substring(0,s.length()-1),s.charAt(s.length()-1) == '(' ? a-1 : a,s.charAt(s.length()-1) == ')' ? b-1 : b);
//		}
//		int length = 0;
//		LinkedList<Character> stack = new LinkedList<Character>();
//		for(int i = 0; i < s.length(); i++){
//			if(s.charAt(i) == ')' && !stack.isEmpty() && stack.getFirst() == '('){
//				stack.removeFirst();
//			}else {
//				stack.addFirst(s.charAt(i));
//			}
//		}
//		if(!stack.isEmpty()){
//			return Math.max(longest(s.substring(1),s.charAt(0) == '(' ? a-1 : a,s.charAt(0) == ')' ? b-1 : b), 
//					longest(s.substring(0,s.length()-1),s.charAt(s.length()-1) == '(' ? a-1 : a,s.charAt(s.length()-1) == ')' ? b-1 : b));
//		}
//		return s.length();
//	}
	
	
	
	
	
	
	
	


}
