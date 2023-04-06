public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return helper(1, n);
    }
    
    public int helper(int l, int r) {
        if (l == r) {
            return l;
        }
         
        int mid = l + (r - l) / 2;
         
        if (this.isBadVersion(mid)) {
            return helper(l, mid);
        } else {
            return helper(mid + 1, r);
        }
    }
}
