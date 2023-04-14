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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        if(head==null)
        {
            return head;
        }
       
        curr=head;
        next=curr;
        prev=null;
        int count=0;
        while(curr!=null)
        {
          
            
        
            if(curr.val==val)
            {
                System.out.println(count);
                if(prev==null)
                {
                    head=head.next;
                }else
                {
                      prev.next = curr.next;
                }
               
            }  else
            {
                 prev=curr;
            }
            count++;
             curr = curr.next;


        }
    return head;
    }
    
}