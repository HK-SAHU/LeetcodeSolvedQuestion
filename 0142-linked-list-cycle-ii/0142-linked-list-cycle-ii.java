/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head== null || head.next==null){
            return null;
        }
        if(head.next.next==head){
            return head;
        }
        ListNode fast=head;
        ListNode slow= head;
        ListNode pointer=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                while(pointer!=slow){
                    pointer= pointer.next;
                    slow=slow.next;
                }
                return pointer;
            }
        }
        
        return null;
    }
}