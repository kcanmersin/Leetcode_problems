class NumArray {
    private int [] numbers;
    public NumArray(int[] nums) {
        numbers= new int [nums.length];
        int count=0;
        for(int a : nums)
        {
            numbers[count]=a;
            count++;
        }
                
    }
    
    public int sumRange(int left, int right) {
     int sum=0;
        for(int a=left;a<=right;a++)
        {
            sum+=numbers[a];
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */