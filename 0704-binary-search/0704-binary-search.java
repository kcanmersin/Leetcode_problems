class Solution {
    public int search(int[] nums, int target) {
        
        
        
        return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int[] nums, int target,int l,int r)
    {
        if (l > r) {
            return -1;
        }
        int mid = (r+l)/2;
        
        if(target>nums[mid])
        {
            return helper(nums,target,mid+1,r);
        }
        
        if(target<nums[mid])
        {
            return helper(nums,target,l,mid-1);
        }
        if(target==nums[mid])
        {
            return mid;
        }
        
        return -1;
    }
}