class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        
        boolean[] used = new boolean[n];
        
        backtrack(n, k, 0, used, new ArrayList<>(), res);
        return res;
    }
    
    private void backtrack(int n, int k, int start, boolean[] used, List<Integer> curr, List<List<Integer>> res) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = start; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                curr.add(i + 1);
                backtrack(n, k, i + 1, used, curr, res);
                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
}
