class Solution {
    public String reverseWords(String s) {
        int p1 = 0, p2 = s.length() - 1;
        char[] charArr = s.toCharArray();
        char temp;

        for (int a = 0; a < s.length(); a++) {
            if (charArr[a] == ' ' || a == s.length() - 1) {
                p2 = (a == s.length() - 1) ? a : a - 1;
                while (p1 < p2) {
                    temp = charArr[p2];
                    charArr[p2] = charArr[p1];
                    charArr[p1] = temp;
                    p1++;
                    p2--;
                }
                p1 = a + 1;
            }
        }

        String result = new String(charArr);

        return result;
    }
}
