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
        ArrayList<Integer> list = new ArrayList<>();
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
        while(p1!=null && p2!=null){
             list.add(p1.val+p2.val);
            p1=p1.next;
            p2=p2.next;
        }
        
        int max= list.get(0);
        for(int i=1;i<list.size();i++){
            int current= list.get(i);
            if(current> max){
                max=current;
            }
        }
        return max;
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