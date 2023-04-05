class Solution {

    public int longestPalindrome(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
     
        
        
    int len=0;
        int odd=0;
        
      for (char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
          System.out.println(map.get(ch) );
            if (map.get(ch) % 2 == 1){
                odd ++;
            }
            else{
                odd--;
            }
        }
        if (odd > 1){
            return s.length() - odd + 1;
        }
        return s.length();
    }
}
