package ToOffer;

public class Q24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode next = head.next;
        while(next != null) {
            head.next = pre;
            pre = head;
            head = next;
            next = head.next;
        }
        head.next = pre;
        return head;
    }
}
