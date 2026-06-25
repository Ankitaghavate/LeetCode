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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode midprev=getMid(head);
        ListNode mid=midprev.next;
        midprev.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }

    public ListNode merge(ListNode left,ListNode right)
    {
        ListNode p1=left;
        ListNode p2=right;
        ListNode d=new ListNode(-1);
        ListNode ans=d;

        while(p1!=null && p2!=null)
        {
            if(p1.val<=p2.val)
            {
                ListNode newNode=new ListNode(p1.val);
                d.next=newNode;
                d=d.next;
                p1=p1.next;
            }
            else if(p1.val>p2.val)
            {
                ListNode newNode=new ListNode(p2.val);
                d.next=newNode;
                d=d.next;
                p2=p2.next;
            }
        }

        while(p1!=null)
        {
            ListNode newNode=new ListNode(p1.val);
                d.next=newNode;
                d=d.next;
                p1=p1.next;
        }

        while(p2!=null)
        {
            ListNode newNode=new ListNode(p2.val);
                d.next=newNode;
                d=d.next;
                p2=p2.next;
        }
        return ans.next;
    }

    public ListNode getMid(ListNode head)
    {
        ListNode pre=null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return pre;
    }
}