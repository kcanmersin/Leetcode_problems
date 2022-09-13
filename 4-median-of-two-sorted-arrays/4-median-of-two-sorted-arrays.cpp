class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
       long double sum=0;
        int f=nums1.size(),s=nums2.size();
        printf("%d %d",f,s);
        if(f==0)
        {
            if(s%2==0)
            {
                return (nums2[((s)/2)-1]+nums2[((s)/2)])/2.00000;
                
            }else
            {
                 return nums2[s/2];
            }
        }else if(s==0)
        {
            if(f%2==0)
            {
                return (nums1[((f)/2)-1]+nums1[((f)/2)])/2.00000;
                
            }else
            {
                 return nums1[f/2];
            }
        }
        int* ptr = (int*) calloc(sizeof(int),(f+s));
        int a=0,b=0,i=0;
        while(a<f && b<s)
        {
            if (nums1[a] < nums2[b])
            ptr[i++] = nums1[a++];
             else
            ptr[i++] = nums2[b++];
        }
        while (a < f)
        {
                    ptr[i++] = nums1[a++];

        }
 
    while (b < s)
    {
                ptr[i++]=nums2[b++];

    }
        printf("by %lu %lu %d",ptr[((f+s)/2)-1],ptr[((f+s)/2)],s);
        if((f+s)%2==0)
        {
            printf("baay");
            return (ptr[((f+s)/2)-1]+ptr[((f+s)/2)])/2.00000;
        }else
        {
            return ptr[(f+s)/2];
        }
        return 1;
        
    }
};