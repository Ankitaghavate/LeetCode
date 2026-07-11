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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;

        int carry=0;
        ListNode d=new ListNode(-1);
        ListNode ans=d;

        while(p1!=null && p2!=null)
        {
            int sum=p1.val+p2.val+carry;
            int digit=sum%10;

            carry=sum/10;

            ListNode newNode=new ListNode(digit);
            d.next=newNode;
            d=d.next;

             p2=p2.next;
             p1=p1.next;
        }

        while(p1!=null)
        {
            int sum=p1.val+carry;
            int digit=sum%10;

            carry=sum/10;

            ListNode newNode=new ListNode(digit);
            d.next=newNode;
            d=d.next;

            p1=p1.next;
           
        }
        while(p2!=null)
        {
            int sum=p2.val+carry;
            int digit=sum%10;

            carry=sum/10;

            ListNode newNode=new ListNode(digit);
            d.next=newNode;
            d=d.next;

            p2=p2.next;
        }

        if(carry>0)
        {
            ListNode newNode=new ListNode(carry);
            d.next=newNode;
            d=d.next;
        }
        return ans.next;

    }
}