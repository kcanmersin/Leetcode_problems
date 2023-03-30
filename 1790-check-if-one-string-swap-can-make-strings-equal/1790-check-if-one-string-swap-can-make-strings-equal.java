class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int diff = 0;
        int [] count = new int [26];
        
        
       if (s1.equals(s2)) {
        return true;
    }
        if (s1.length() != s2.length())
            return false;
        
        
        
        
        for (int i=0; i<s1.length(); i++) {
            
            count[s1.charAt(i) - 'a'] += 1;
            
            count[s2.charAt(i) - 'a'] -= 1;
            if (s1.charAt(i) != s2.charAt(i)) 
            {
                diff++;
            }
        }
        for (int number : count) {
            if (number != 0)
                return false;
        }
        if(diff==2)
        {
            return true;
        }
    
    return false;
    }
}