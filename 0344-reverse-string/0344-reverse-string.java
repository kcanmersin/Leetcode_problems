class Solution {
    public void reverseString(char[] s) {
        int p1=0,p2=s.length-1;
        
        char temp;
        while(p1<p2)
        {
            
            temp=s[p2];
            s[p2]=s[p1];
            s[p1]=temp;
            p1++;
            p2--;
        }
    }
}