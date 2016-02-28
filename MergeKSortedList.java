/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists ==null || lists.length==0){
            return null;
        }
        
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });
        
        for(ListNode node: lists){
            if(node!=null)
                minHeap.offer(node);
        }
        ListNode head=new ListNode(0);
        ListNode curr=head;
        while (!minHeap.isEmpty()){
            curr.next=minHeap.poll();
            curr=curr.next;
            if(curr.next!=null)
                minHeap.offer(curr.next);
        }
        return head.next;
    }
}
