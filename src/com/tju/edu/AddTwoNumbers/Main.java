package com.tju.edu.AddTwoNumbers;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		
		
		ListNode listNode1 = new ListNode(9);
		listNode1.next = new ListNode(9);
		

		ListNode listNode2 = addTwoNumbers(listNode, listNode1);
		while(listNode2 != null){
			
			System.out.println(listNode2.val);
			listNode2 = listNode2.next;
		}
		
		
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
		int addNum = 0;
		int num = 0;
		while(true){
			if(l1 != null && l2 != null){
				addNum = l1.val + l2.val + num;
				l1.val = addNum % 10;
				num = addNum /10;
				if(l1.next == null && l2.next != null){
					l1.next = l2.next;
					l1 = l1.next;
					l2 = null;
				}else if (l1.next == null && l2.next == null) {
					if(num == 0)break;
					l1.next = new ListNode(num);
					break;
				}else {
					l1 = l1.next;
					l2 = l2.next;
				}
			}else {
				while(num != 0){
					addNum = (l1.val + num);
					l1.val = addNum % 10;
					num = addNum / 10;
					if(l1.next == null && num != 0){

						l1.next = new ListNode(num);
						break;
					}
					l1 = l1.next;
				}
				break;
			}
		}
		return p1;
    }
	 
	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode p1 = new ListNode(0);
		ListNode head = p1;
		int addNum = 0;
		int num = 0;
		while(l1 != null || l2 != null || num !=0){
			
			addNum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val) + num;
			ListNode currentListNode = new ListNode(addNum%10);
			num = addNum /10;
			p1.next = currentListNode;
			p1 = p1.next;
			l1 = (l1 == null)?l1 : l1.next;
			l2 = (l2 == null)?l2 : l2.next;
			
		}
		return head.next;
	        
    }
}
