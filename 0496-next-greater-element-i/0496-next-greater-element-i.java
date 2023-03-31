class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        
        for(int a=0;a<nums1.length;a++) {
            for(int b=0;b<nums2.length;b++) {
                if(nums1[a]==nums2[b]) {
                    for(int c=b+1;c<nums2.length;c++) {
                        if(nums2[c]>nums1[a]) {
                            result[a] = nums2[c];
                            break;
                        }
                    }
                }
            }
        }
        
        return result;
    }
}
