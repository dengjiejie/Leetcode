package com.tju.edu.RotateList;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		
		
		ListNode listNode1 = new ListNode(2);
		listNode.next = new ListNode(2);
		

		ListNode listNode2 = rotateRight(listNode, 1);
		while(listNode2 != null){
			
			System.out.println(listNode2.val);
			listNode2 = listNode2.next;
		}
		
		
	}

	public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)return head;
        ListNode pointFirst = head;
        ListNode pointLast = head;
        
        int i = 1;
        while(pointFirst.next != null){
        	pointFirst = pointFirst.next;
            i++;
        }
        k %= i;
        pointFirst.next = head;
        
        k = i - k - 1;
        while( k > 0){
            pointLast = pointLast.next;

            k--;
        }
        pointFirst = pointLast.next;
        pointLast.next = null;
       

        
        return  pointFirst;

    }
	
	
	
}
