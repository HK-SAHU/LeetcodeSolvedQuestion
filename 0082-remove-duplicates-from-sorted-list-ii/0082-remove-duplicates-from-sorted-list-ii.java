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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                int n=curr.val;
                while(curr!=null && curr.val==n){
                    curr=curr.next;
                }
                prev.next=curr;  // remove the connection of the duplicates in LL
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}