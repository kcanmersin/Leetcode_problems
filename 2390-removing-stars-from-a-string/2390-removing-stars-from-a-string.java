class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int a=0;a <s.length();a++)
        {
            char ch = s.charAt(a);
            if(ch=='*')
            {
                str.deleteCharAt(str.length()-1);
            }else
            {
                str.append(ch);
            }
        }
        return str.toString();
    }
}