class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head, slow = head;
        if(head==null)
        {
            return null;
        }
        for (int i = 0; i < n; i++) 
        {
            fast = fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            return head;
        }
        while (fast.next != null)
        {
            
            fast = fast.next;
            
            slow = slow.next;
            
            
        }
        
        slow.next = slow.next.next;
        
        return head;
    }
}