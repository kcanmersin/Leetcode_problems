class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int parsed;
        for(int a = 0; a < s.length(); a++)
        {
            if(a+2 < s.length() && s.charAt(a+2)=='#')
            {
                parsed = Integer.parseInt(s.substring(a, a+2));
                result.append((char)('a' + parsed - 1));
                a += 2;
            } 
            else if(s.charAt(a) >= '1' && s.charAt(a) <= '9')
            {
               parsed = s.charAt(a) - '0';
                result.append((char)('a' + parsed - 1));
            }   
        }
        return result.toString();
    }
}
