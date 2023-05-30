class Solution {
    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
        int i = 0;
        int pos = 0;
        for(i=n-2 ; i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pos = i;
                break;
            }
        }
        int j = 0;
        int pos2 = 0;
        for(j=n-1 ; j>=pos;j--)
        {
            if(nums[pos]<nums[j])
            {
                pos2 = j;
                break;
            }
        }
        swap(nums,pos,pos2);
        Arrays.sort(nums,i+1,nums.length);

        
    }
    public void swap(int a[],int i,int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}