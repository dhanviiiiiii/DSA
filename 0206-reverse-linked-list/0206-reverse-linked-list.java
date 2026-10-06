/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode previous,current, nxt;
        previous=null;
        current=head;
        nxt=head.next;
        
        while(current!=null){
            current.next=previous;//changing each node
            previous=current;
            current=nxt;
            if(nxt!=null){
                nxt=nxt.next;
            }
        }
        return previous;//head node after reverse
    }
/*
    if(head==null || head.next==null){
        return head;
    }

    ListNode last=reverseList(head.next);
    head.next.next==head;
    head.next=null;
    return last;*/
}