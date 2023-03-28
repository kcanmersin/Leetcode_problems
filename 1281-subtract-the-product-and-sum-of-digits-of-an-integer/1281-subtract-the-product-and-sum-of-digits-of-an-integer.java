class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        int a;
        while(n>0)
        {
            a=n%10;
            prod*=a;
            sum+=a;
            
            n=n/10;
        }
        
        return prod-sum;
    }
}