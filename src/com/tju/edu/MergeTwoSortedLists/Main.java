package com.tju.edu.MergeTwoSortedLists;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(9);

		
		ListNode listNode1 = new ListNode(2);
		listNode1.next = new ListNode(9);
		

		ListNode listNode2 = mergeTwoLists(listNode, listNode1);
		while(listNode2 != null){
	
			System.out.println(listNode2.val);
			listNode2 = listNode2.next;
		}
		
		
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode pointerListNode = new ListNode(0);
		ListNode p = pointerListNode;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				p.next = l1;
				p = p.next; 
				l1 = l1.next;
			}else {
				p.next = l2;
				p = p.next;
				l2 = l2.next;
			}
		}
		if(l1 == null)
			p.next = l2;
		else {
			p.next = l1;
		}
		return pointerListNode.next;     
	}
}
