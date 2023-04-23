class Solution {
public boolean checkInclusion(String s1, String s2) {
    int[] count1 = new int[26];
    
    int[] count2 = new int[26];
    
    for (char c : s1.toCharArray()) {
        count1[c - 'a']++;
    }
    int left = 0, right = 0;
    while (right < s2.length())
    {
        
        if (right - left >= s1.length())
        {
            count2[s2.charAt(left) - 'a']--;
            left++;
        }
        
        count2[s2.charAt(right) - 'a']++;
        if (Arrays.equals(count1, count2))
        {
            return true;
        }
        right++;
    }
    return false;
}

}