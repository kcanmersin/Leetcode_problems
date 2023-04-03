class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();

        for (int a = 0; a < s.length(); a++) {
            char c = s.charAt(a);
            if (c >= 'A' && c <= 'Z') {
         
                str.append((char) (c - 'A' + 'a'));
            } else {
               
                str.append(c);
            }
        }
        return str.toString();
    }
}
