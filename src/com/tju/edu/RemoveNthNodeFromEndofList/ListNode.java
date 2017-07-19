package com.tju.edu.RemoveNthNodeFromEndofList;


public class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public String toString ( ) {
		StringBuffer string =new StringBuffer();
		ListNode head = this;
    	while (head != null) {
    		string.append(head.val);
    		head = head.next;
			
		}
    	return string.toString();
	}
}
