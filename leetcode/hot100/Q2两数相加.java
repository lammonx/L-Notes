package leetcode.hot100;

//02-两数相加


 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) 
            return null;
        if(l1==null)
            l1=new ListNode(0);
        if(l2==null) 
            l2=new ListNode(0);//考虑官网预期输出才有上面的代码，不然直接有null直接返回null
        ListNode result=l1;
        while(true){
            if(l1.next==null&&l2.next==null){
                l1.val+=l2.val;
                if(l1.val>=10){
                    l1.val-=10;
                    l1.next=new ListNode(1);
                }
                break;
            }
            if(l1.next==null) 
                l1.next=new ListNode(0);
            if(l2.next==null) 
                l2.next=new ListNode(0);
            l1.val+=l2.val;
            if(l1.val>=10){
                l1.val-=10;
                l1.next.val+=1;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return result;
    }
}