
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 =l2;
        int val1 =0 , val2=0 , carry =0;
        ListNode dummy = new ListNode(-1);
        ListNode d1=dummy;
        while(t1 != null || t2 != null){
            val1 = t1 != null ?  t1.val :0;
            val2 = t2 != null ?  t2.val :0;
            int total = val1+val2+carry;
            carry = total/10;
            ListNode temp = new ListNode(total%10);
            d1.next=temp;
            d1=d1.next;
            if(t1 != null)t1=t1.next;
            if(t2 != null)t2=t2.next;    
        }
        // while(t1!=null){
        //     val1 = t1.val;
        //     int total = val1+carry;
        //     carry = total/10;
        //     ListNode temp = new ListNode(total%10);
        //     d1.next=temp;
        //     d1=d1.next;
        //     t1=t1.next;
        // }
        // while(t2!=null){
        //     val2 = t2.val;
        //     int total = val2+carry;
        //     carry = total/10;
        //     ListNode temp = new ListNode(total%10);
        //     d1.next=temp;
        //     d1=d1.next;
        //     t2=t2.next;
        // }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            d1.next=temp;
            d1=d1.next;
        }
        return dummy.next;
    }
}