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
      ListNode slow=head;
      ListNode fast=head;
      int ans=0;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      ListNode prev=null;
      ListNode next=null;
      while(slow!=null){
        next=slow.next;
        slow.next=prev;
        prev=slow;
        slow=next;
      }
      ans=math.max(ans,head.val+prev.val);
      head=head.next;
      prev=prev.next;
      
