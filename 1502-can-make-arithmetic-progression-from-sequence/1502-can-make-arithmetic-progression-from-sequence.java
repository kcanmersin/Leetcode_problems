class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
    int c;
        c=arr[1]-arr[0];
        for (int a = 1; a < arr.length; a++) {
            if((arr[a-1]+c)!=arr[a])
            {
                return false;
            }
            System.out.println(arr[a]);
        }
        
        return true;
    }
}
