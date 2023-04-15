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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
        {
            return head;
        }
          
    int length = 1;
    ListNode tail = head;
    while (tail.next != null) {
        tail = tail.next;
        length++;
    }
    
    tail.next = head;
    
    k = k % length;
        ListNode actual=head;
    if (k > 0) {
        for (int i = 0; i < length- k; i++) {
            head = head.next;
            tail=tail.next;
        }
    }
   
    tail.next = null;
    return head;
        
        
    }
 
    
   
}