class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum=0;
        int sums=0;
        for(int a=0;a<nums.size();a++)
        {
                sum+=nums[a];
        }
        for (int i = 0; i < nums.size(); i++) {
        sum -= nums[i];
        if (sum == sums) return i;
        sums += nums[i];
    }
    return -1;

    }
};