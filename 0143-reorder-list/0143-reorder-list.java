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
    public void reorderList(ListNode head) {
        ListNode mid=getMid(head);

        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode LH=head;
        ListNode RH=prev;

        ListNode nextL;
        ListNode nextR;

        while(LH!=null && RH!=null)
        {
            nextL=LH.next;
            LH.next=RH;

            nextR=RH.next;
            RH.next=nextL;

            LH=nextL;
            RH=nextR;
        }
    }

    public ListNode getMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}