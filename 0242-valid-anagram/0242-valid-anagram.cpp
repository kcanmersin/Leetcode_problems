class Solution {
public:
    bool isAnagram(string s, string t) {
         vector<int> useds(26, 0);
         vector<int> usedt(26, 0);
        
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int y=0;y<s.length();y++)
        {
            useds[s[y]%97]++;
            usedt[t[y]%97]++;
        }
        
        for(int a=0;a<useds.size();a++)
        {
            
            printf("%d %d\n",usedt[a],useds[a]);
            if(usedt[a]!=useds[a])
            {
                return false;
            }
        }
        return true;
    }
};