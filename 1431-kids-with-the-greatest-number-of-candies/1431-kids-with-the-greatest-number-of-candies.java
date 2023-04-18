class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bool = new ArrayList<>();
        int maxcandy= Integer.MIN_VALUE;
        
        for(int a:candies)
        {
            maxcandy= Math.max(maxcandy,a);
        }
        
        for(int a : candies)
        {
            if(a+extraCandies>=maxcandy)
            {
                bool.add(true);
            }else
            {
                bool.add(false);
            }
        }
        
        return bool;
        
    }
}