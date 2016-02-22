/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
    ListNode dummy=new ListNode(0);
    ListNode odd=dummy, even=dummy, evenHead=dummy; //tail of odd/even
    
    while (head!=null){
       // System.out.print(head.val);
        //even case
        if(head.val%2!=0){
            odd.next=head;
            odd=head;
            head=head.next;
            odd.next=evenHead;
            
        }//odd case
        else{
            if(even==dummy){
                if(odd!=dummy){
                    even=odd;
                }
                 evenHead=head;
            }
          //  System.out.println(even.val);
            even.next=head;
            even=head;
            head=head.next;
            even.next=null;
            
        }
    }
    
    return dummy.next;
    }
}
