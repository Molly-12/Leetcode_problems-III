class Solution {
    public void reorderList(ListNode head) {
      ListNode mid=middle(head);
      ListNode hs=reverse(mid.next);
      ListNode hf=head;
      while(hf!=null && hs.next!=null){
        ListNode temp=hf.next;
        hf.next=hs;
        hf=temp;
        temp=hs.next;
        hs.next=hf;
        hs=temp;
      }
      if(hs!=null){
        hs.next=null;
      }
    }
  ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

        
        
    
