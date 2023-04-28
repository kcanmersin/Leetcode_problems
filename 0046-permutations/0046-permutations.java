class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        boolean[] used = new boolean[nums.length];
        generate(nums, used, new ArrayList<Integer>(), result);
        return result;
    }
    
    private void generate(int[] nums, boolean[] used, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<Integer>(permutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                permutation.add(nums[i]);
                used[i] = true;
                generate(nums, used, permutation, result);
                used[i] = false;
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
