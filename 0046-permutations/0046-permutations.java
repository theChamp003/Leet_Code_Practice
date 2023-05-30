class Solution {
     List<List<Integer>> ans=new ArrayList<>() ;
    public List<List<Integer>> permute(int[] nums) 
    {
        //List<List<Integer>> ans ;
        f(nums,new HashSet<>(),0,new ArrayList<>());
        return ans;
    }
    public void f(int nums[],HashSet<Integer> hs,int i,List<Integer> temp)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(hs.contains(nums[j]))
            continue;
            temp.add(nums[j]);
            hs.add(nums[j]);
            f(nums,hs,i+1,temp);
            temp.remove(temp.size()-1);
            hs.remove(nums[j]);
        }
    }
}