class Solution {
    public void swap(int[] nums,int x,int y)
    {
        int temp= nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void moveZeroes(int[] nums) {
        for(int a=0;a<nums.length;a++)
        {
            for(int b=a;b<nums.length;b++)
            {
                if(nums[a]==0)
                {
                    nums[a]=nums[b];
                    nums[b]=0;
                }
            }
        }
    }
}