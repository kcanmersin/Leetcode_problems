class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int temp=0;
        for(int a=0;a<accounts.length;a++)
        {
            for(int b=0;b<accounts[0].length;b++)
            {
                temp+=accounts[a][b];
            }
            
            if(temp>max)
            {
                max=temp;
            }
            temp=0;
        }
        
        
        return max;
    }
}