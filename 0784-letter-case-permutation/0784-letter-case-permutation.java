class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        generatePermutations(s.toCharArray(), 0, "", res);
        return res;
    }
    
    private void generatePermutations(char[] s, int index, String curr, List<String> res) {
        if (index == s.length) {
            res.add(curr);
            return;
        }
        
        if (Character.isLetter(s[index])) {
            
            generatePermutations(s, index + 1, curr + Character.toLowerCase(s[index]), res);
            
            generatePermutations(s, index + 1, curr + Character.toUpperCase(s[index]), res);
            
        } else {
            
            generatePermutations(s, index + 1, curr + s[index], res);
        }
    }
}
