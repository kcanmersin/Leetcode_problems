class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            int index = i;
            map.put(c, index);
        }

   
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (map.get(c1) < map.get(c2)) {
                    break;
                } else if (map.get(c1) > map.get(c2)) {
                    return false;
                } else if (j == Math.min(word1.length(), word2.length()) - 1 && word1.length() >                             word2.length()) {
                    return false;
                }
            }
        }

        return true;
    }
}
