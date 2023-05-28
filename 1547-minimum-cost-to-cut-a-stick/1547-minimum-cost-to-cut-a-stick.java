class Solution {
    HashMap<String,Integer> hm = new HashMap<>() ;
    public int minCost(int n, int[] cuts) 
    {
       //Arrays.sort(cuts);
        return f(cuts,0,n);
    }

    public int f(int cuts[],int l,int r)
    {
       // if(l<0 || r > cuts.length)
       // return 0;
       String s = l + "kk" + r;
       if(hm.containsKey(s))
       return hm.get(s);
       //String s = l + "kk" + r;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<cuts.length;i++)
        {
            if(cuts[i]<=l || cuts[i]>=r)
            continue;
            res = Math.min(f(cuts,l,cuts[i])+r-l+f(cuts,cuts[i],r),res);

        }
        res = res == Integer.MAX_VALUE ? 0 : res;
        hm.put(s,res);
        return res;
    }

}