class Solution {
public:
    bool isSubsequence(string s, string t) {
        int finder=0;
        bool contain=false;
        vector<char> hash;
        for(int a=0;a<s.length();a++)
        {
            contain=false;
            for(int b=finder; b<t.length();b++ )
            {
                if(s[a]==t[b])
                {
                    hash.push_back(t[b]);
                    finder=b+1;
                    contain=true;

                    break;
                }
            }
            if(!contain)
            {
                return false;
            }
        }
        for(int a=0;a<s.length();a++)
        {
            cout<<hash[a]<<" ";
        }
        if(hash.size()!=s.length())
        {
            return false;
        }
        for(int a=0;a<s.length();a++)
        {
            if(hash[a]!=s[a])
            {
                return false;
            }
        }
    return true;
    }
};