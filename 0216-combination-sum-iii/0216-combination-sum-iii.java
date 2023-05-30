class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    // HashSet<Integer> hs = new HashSet<>();
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        int num[] = {0,1,2,3,4,5,6,7,8,9};
        HashSet<Integer> hs = new HashSet<>();
        f(new ArrayList<>(),k,1,0,n,num,hs);
        //HashSet<Integer> hs = new HashSet<>();
        return ans;
        
    }

    public void f(List<Integer> temp,int k,int i,int sum,int n,int num[],HashSet<Integer> hs)
    {
        if(temp.size() == k && sum == n )
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j=i;j<num.length;j++)
        {
            if(sum + num[j] <= n && hs.contains(num[j]) == false)
            {
                temp.add(num[j]);
                hs.add(num[j]);
                f(temp,k,j,sum+num[j],n,num,hs);
                hs.remove(num[j]);
                temp.remove(temp.size()-1);
            }
            
        }

    } 
}