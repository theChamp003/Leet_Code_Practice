class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    HashSet<List<Integer>> vis = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        
        f(0,new ArrayList<>(), new HashSet<>(),nums);
        return ans;

    }
    public void f(int i,List<Integer> temp,HashSet<Integer> hs,int nums[])
    {
        if(i>=nums.length)
        {
            if(vis.contains(temp))
            return;
            vis.add(temp);
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(hs.contains(j))
            continue;
            hs.add(j);
            temp.add(nums[j]);
            f(i+1,temp,hs,nums);
            hs.remove(j);
            temp.remove(temp.size()-1);
        }
    }
}