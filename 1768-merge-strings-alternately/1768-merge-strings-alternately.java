class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
        return result.toString();
    }
}
