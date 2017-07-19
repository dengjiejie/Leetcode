package com.tju.edu.ValidParentheses;

import java.util.LinkedList;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = "({]])]})]}([)}{][)]{}{(])}([]}])})}([]}({}([{][{}";
		System.out.println(isValid(height));
		System.out.println("dddd");
	}
	
	public static boolean isValid(String s) {
		LinkedList<Character> list = new LinkedList<Character>();
		for(int i =0; i < s.length(); i++){
			switch (s.charAt(i)) {
			case ')':
				if(list.isEmpty() || list.getFirst() != '('){
					return false;
				}
				list.removeFirst();
				break;
			case ']':
				if(list.isEmpty() || list.getFirst() != '['){
					return false;
				}
				list.removeFirst();
				break;
			case '}':
				if(list.isEmpty() || list.getFirst() != '{'){
					return false;
				}
				list.removeFirst();
				break;
			default:
				list.addFirst(s.charAt(i));
				break;
			}
		}
		if(list.isEmpty())
			return true;
		return false;
    }
	
//	public static boolean isValid(String s) {
//		Map<Character, Character> map = new HashMap<Character, Character>();
//		map.put('(', ')');
//		map.put('[', ']');
//		map.put('{', '}');
//		if(!map.containsKey(s.charAt(0)))return false;
//		LinkedList<Character> list = new LinkedList<Character>();
//		for(int i =0; i < s.length(); i++){
//			System.out.println(i);
//			 if(list.isEmpty() || map.containsKey(s.charAt(i))){
//					 list.addFirst(s.charAt(i));
//			 }
//			 else if(s.charAt(i) == map.get(list.getFirst())){
//				list.removeFirst();
//			 }else {
//				return false;
//			}
//		}
//		if(list.isEmpty())
//			return true;
//		return false;
//    }
}
