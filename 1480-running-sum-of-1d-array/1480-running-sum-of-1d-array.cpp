class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sum(nums.size(),0);
        for(int a=0;a<nums.size();a++)
        {
            for(int b=0;b<=a;b++)
            {
                sum[a]=sum[a]+nums[b];
            }
        }
        return sum;
    }

};