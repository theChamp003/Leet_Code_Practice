class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int tar) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(can);

        int n = can.length;
        //for(int i=0;i<n;i++)
        {
        List<Integer> temp = new ArrayList<>();
        //temp.add(can[i]);
        HashSet<List<Integer>> hs=new HashSet<>();
        f(ans,can,tar,temp,0,0,n,hs);
        }
        return ans;
    }

    public void f(List<List<Integer>> ans, int can[] , int tar,List<Integer> temp,int i,int sum,int n,HashSet<List<Integer>> hs)
    {
        if(sum>tar)
        return;
        if(sum == tar)
        {
            //System.out.println(sum+" "+i);
            if(hs.contains(temp) == false)
            {
                ans.add(new ArrayList<>(temp));
                hs.add(temp);
            }
            return;
        }
        if(i>=n)
        return;
        for(int j=i;j<n;j++)
        {
            if(j>i && can[j] == can[j-1]) // this condition to be used to in the solution of combinationSum solution. j>i cuz we need starting one regardless of second condition
            continue;
        if(can[j]+sum <= tar)
        {
           // List<Integer> temp1 = new ArrayList<>(temp);
            temp.add(can[j]);
            sum+=can[j];
            f(ans,can,tar,temp,j+1,sum,n,hs); // and here add j+1 cuz you cannot use that number .
            sum-=can[j];
            temp.remove(temp.size()-1);


        }
        }
    }
}