class Solution {
public:
    bool isIsomorphic(string s, string t) {
         vector<int> s_hash; 
         vector<int> t_hash; 
        s_hash.push_back(0);
        t_hash.push_back(0);
        bool isfound=false;
        int index;
        for(int a=1;a<s.length();a++)
        {
            isfound=false;
            for(int b=0;b<a && isfound==false ;b++)
            {
                if(s[a]==s[b])
                {
                    index=b;
                    isfound=true;
                }
            }
            if(isfound==false)
            {
                 s_hash.push_back(a);
            }else
            {
                s_hash.push_back(index);
            }
        }
        for(int a=1;a<t.length();a++)
        {
            isfound=false;
            for(int b=0;b<a && isfound==false ;b++)
            {
                if(t[a]==t[b])
                {
                    index=b;
                    isfound=true;
                }
                
            }
            if(isfound==false)
            {
                 t_hash.push_back(a);
            }else
            {
                t_hash.push_back(index);
            }
        }
        for(int b=0;b<s.length();b++)
            {
                if(t_hash[b]!=s_hash[b])
                {
                    return false;
                }
                
            }
        return true;
    }
};