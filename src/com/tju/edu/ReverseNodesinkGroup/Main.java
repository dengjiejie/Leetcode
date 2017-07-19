package com.tju.edu.ReverseNodesinkGroup;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = null;
		
		
	//	listNode.next = new ListNode(2);
//		listNode.next.next = new ListNode(3);
//		listNode.next.next.next = new ListNode(4);
//		listNode.next.next.next.next = new ListNode(5);

		System.out.println(reverseKGroup(listNode,2).toString());
		
	}
	
	public static ListNode reverseKGroup(ListNode head, int k) {
		if(head == null || head.next == null)return head;
		ListNode listNode = head;
		int n = 0;
		while (listNode != null) {
			n++;
			listNode = listNode.next;
		}
		n /= k;
		System.out.println(n);
		listNode = new ListNode(0);
		//listNode.next = head;
		ListNode tail = listNode;
		ListNode subtail = null;
		ListNode l1,l2;
		l2 = head;
		head = head.next;
		for(int i = 1; i <= n ; i++){
			subtail = l2;
			l1 = subtail;
			for(int j = 0; j < k; j++){
				l2.next = l1;
				l1 = l2;
				l2 = head;
				if(head != null)
					head = head.next;
			}
			tail.next = l1;
			tail = subtail; 
		}
		tail.next = l2; 
		return listNode.next;
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
