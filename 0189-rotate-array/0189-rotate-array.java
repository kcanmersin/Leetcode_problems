class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] res = new int[n];
        if(k==0)
        {
            return;
        }
        int l = n - k;
        int r = n - 1;
        int j = l;
        
        for (int i = 0; i < n; i++) {
            res[i] = nums[j];
            j = (j + 1) % n;
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}
