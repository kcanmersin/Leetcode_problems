

int searchInsert(int* nums, int numsSize, int target){

    int trueIndex=-1;
    int lookfor=1;

    for(int a=0;a<numsSize;a++)
    {
                    printf("%d\n",nums[a]);

        if(target==nums[a])
        {
            return a;
        }else if(target<nums[a])
        {
             printf("true ind deis %d\n ",nums[a]);
            trueIndex=a;
            return a;
        }
        
    }
    if(trueIndex==-1)
    {
        return numsSize;
    }
    return trueIndex;
}