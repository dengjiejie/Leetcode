package com.tju.edu.PartitionList;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ListNode partition(ListNode head, int x) {
		if (head == null || head.next == null) return head;
		ListNode pointListNode = new ListNode(0);
		pointListNode.next = head;
		ListNode checkListNode = head;
		ListNode preListNode = pointListNode;
		head = pointListNode;
		while (checkListNode != null) {
			if(checkListNode.val < x){
				if(pointListNode.next == checkListNode){
					pointListNode = pointListNode.next;
					preListNode = preListNode.next;
					checkListNode = checkListNode.next;
				}else {
					preListNode.next = checkListNode.next;
					checkListNode.next = pointListNode.next;
					pointListNode.next = checkListNode;
					pointListNode = checkListNode;
					checkListNode = preListNode.next;
				}
			}else {
				preListNode = preListNode.next;
				checkListNode = checkListNode.next;
			}
		}
		
		return head.next;   
	}
	
	
	
	
	
	
}
