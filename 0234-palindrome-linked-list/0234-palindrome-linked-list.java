class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            sb.insert(0, (char)(curr.val + '0'));
            curr = curr.next;
        }
        
        String str = sb.toString();
        String left = str.substring(0, count/2);
        String right = str.substring((count+1)/2);
        StringBuilder sub = new StringBuilder(right);
        
        if (left.equals(sub.reverse().toString())) {
            return true;
        }
        
        return false;
    }
}
