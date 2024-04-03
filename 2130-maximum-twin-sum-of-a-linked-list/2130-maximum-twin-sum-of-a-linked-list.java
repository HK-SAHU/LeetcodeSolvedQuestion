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
    public int pairSum(ListNode head) {
        if(head==null) return 0;
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf= reverse(slow);
        slow.next=null;
        
        ListNode p1=head;
        ListNode p2=secondHalf;
        int maxSum=0;
        while(p1!=null && p2!=null){
            int sum=p1.val+p2.val;
            if(maxSum<sum){
                maxSum=sum;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return maxSum;
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode prev=null;
        while(curr!=null){
            ListNode after= curr.next;
            curr.next=prev;
            prev=curr;
            curr= after;
        }
        return prev;
    }
}