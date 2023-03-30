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
    public ListNode middleNode(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nums.add(curr.val);
            curr = curr.next;
        }
        int mid = nums.size() / 2;
for(int a=0;a<mid;a++)
{
    head=head.next;
}
        return head;
    }
}
