

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){

    int *arr=(int*)malloc(2 * sizeof(int));
    *returnSize=2;
    int temp;
    for(int a=0; a<numsSize;a++)
    {
        temp=target-nums[a];
        for(int b=a+1;b<numsSize;b++)
        {
            if(temp==nums[b])
            {
                arr[0]=a;
                arr[1]=b;
                return arr;
            }
        }
    }
    return arr;
}