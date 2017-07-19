package com.tju.edu.SwapNodesinPairs;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		
		
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		System.out.println(swapPairs(listNode).toString());
		
	}

	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode left = head;
		ListNode right = head.next;
		ListNode preListNode = new ListNode(0);
		head = head.next;
		while (true) {
			left.next = right.next;
			right.next = left;
			preListNode.next = right;
			preListNode = left;
			if(preListNode.next == null || preListNode.next.next == null)break;
			left = preListNode.next;
			right = left.next;
		}
		return head;
    }
}
