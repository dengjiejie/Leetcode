package com.tju.edu.RemoveNthNodeFromEndofList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next= new ListNode(5);

		System.out.println(removeNthFromEnd(head,2));
		System.out.println("dddd");
	}
	
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode listNode = head;
		ListNode listNodefirst = head;
		for(int i = 0; i < n; i++)
			listNodefirst = listNodefirst.next;
		if(listNodefirst == null)
			return head.next;
		while (listNodefirst.next != null) {
			listNodefirst = listNodefirst.next;
			listNode = listNode.next;
		}
		listNode.next = listNode.next.next;
		return head;
    }
	
	
	
	
	
	
	
}
