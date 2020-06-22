package ToOffer;

import java.util.ArrayList;
import java.util.LinkedList;

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
public class Q6 {
	 public int[] reversePrint(ListNode head) {
	        int size = 0 ;
	        for ( ListNode list = head ;list != null;list = list.next , size++);
	        int[] arr = new int[size];
	        for ( ListNode list = head ;list != null;list = list.next ){
	            arr[--size] = list.val;
	        } 
	        return arr;
		 
	    }
//	 ArrayList<Integer> arrayList = new ArrayList<>();
//	 void get(ListNode head) {
//		 if(head == null) return ;
//		 get(head.next);
// 		 arrayList.add(head.val);
//	 }	 
	 }
