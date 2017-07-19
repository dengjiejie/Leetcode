package com.tju.edu.SimplifyPath;

import java.util.LinkedList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(simplifyPath("/g/.."));
	}
	
	public static String simplifyPath(String path) {
		LinkedList<String> stack = new LinkedList<String>();
		int position;
		path = path.substring(1);
		path += "/";
		String subpath;
		while (!path.isEmpty()) {
			position = path.indexOf("/");
			subpath = path.substring(0,position);
			path = path.substring(position+1);
			if(subpath.equals("..")){
				if(!stack.isEmpty()){
					stack.removeFirst();
				}
			}else if (subpath.equals(".") || subpath.isEmpty()) {
				
			}else {
				stack.addFirst(subpath);
			}
		}
		StringBuffer stringBuffer = new StringBuffer();

		while (!stack.isEmpty()) {
			stringBuffer.append("/");
			stringBuffer.append(stack.removeLast());
		}
		return stringBuffer.length()==0 ?"/" : stringBuffer.toString();
    }
	
	
}
