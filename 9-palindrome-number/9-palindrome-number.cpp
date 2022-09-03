class Solution {
public:
    bool isPalindrome(int x) {
        long int revX=0;
        int control=x;
        int tempX=x;
        int count=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            tempX=x%10;
            x=x/10;
            revX=(revX*10)+tempX;
        }
            if(revX==control)
            {
                return true;
                
            }
                    
        return false;
    }
};