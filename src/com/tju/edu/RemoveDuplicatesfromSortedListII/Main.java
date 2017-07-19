package com.tju.edu.RemoveDuplicatesfromSortedListII;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		
		
		ListNode listNode1 = new ListNode(9);
		listNode1.next = new ListNode(9);
		

		ListNode listNode2 = deleteDuplicates(listNode);
		while(listNode2 != null){
			
			System.out.println(listNode2.val);
			listNode2 = listNode2.next;
		}
		
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)return head;
		while (head.next != null && head.val == head.next.val ) {
			while (head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			if(head.next != null){
				head = head.next;
			}else {
				return null;
			}
		}
		if(head == null || head.next == null)return head;
		ListNode node = head.next;
		ListNode preListNode = head;
		preListNode.next = node;
		ListNode nextListNode = node.next;
		
		while (nextListNode != null) {
			if(nextListNode.val != node.val){
				preListNode = node;
				node = nextListNode;
				nextListNode = nextListNode.next;
				continue;
			}
			
			while (nextListNode != null && nextListNode.val == node.val) {
				nextListNode = nextListNode.next;
			}
			preListNode.next = nextListNode;
			node = nextListNode;
			if(nextListNode != null){
				nextListNode = nextListNode.next;
			}else {
				return head;
			}
		}
		return head;
    }
	
}
