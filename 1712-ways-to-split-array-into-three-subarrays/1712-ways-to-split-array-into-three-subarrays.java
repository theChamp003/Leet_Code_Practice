class Solution {
    public int waysToSplit(int[] nums) 
    {
        int n = nums.length;
        int pre[] = new int[n+1];
        //pre[0]=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            pre[i+1]=pre[i]+nums[i];
        }
        long res = 0;
        int i1 = n-2;
        int i2 = n-2;
        for(int j = n-1;j>=2;j--)
        {
            int right = pre[n]-pre[j];
            while(i1>0 && pre[j]-pre[i1] <=right)
            i1--;
            i2 = Math.min(i2,j-1);
            while(i2>0 && pre[i2] > pre[j] - pre[i2])
            i2--;
            if(i2>i1 && i1>=0) // very Important ..... 
            res+=(long)(i2 - i1);
        }
        return (int) (res % 1000000007);
    }
}