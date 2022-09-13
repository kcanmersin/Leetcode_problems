class Solution {
public:
    int reverse(int x) {
        int revx=0;
        while(x!=0)
        {
            int rev=x%10;
            x/=10;
            if (revx > INT_MAX/10 || (revx == INT_MAX / 10 && rev > 7)) return 0;
            if (revx < INT_MIN/10 || (revx == INT_MIN / 10 && rev < -8)) return 0;
            revx=(rev)+(revx*10);
        }
       
        return revx;
    }
};