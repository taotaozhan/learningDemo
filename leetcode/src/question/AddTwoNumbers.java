package question;

/**
 * 两数相加
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
    public static ListNode  addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null ) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
       ListNode ls  =new ListNode(3);
       ls.next = new ListNode(4);
       ls.next.next = new ListNode(8);
       ListNode la = new ListNode(5);
       la.next = new ListNode(7);
       la.next.next = new ListNode(3);
       la.next.next.next = new ListNode(6);
       ListNode a = addTwoNumbers(ls,la);
       System.out.println(a);
    }
}
