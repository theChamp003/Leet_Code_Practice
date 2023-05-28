class Solution {
    public int[][] merge(int[][] inter) 
    {
        Arrays.sort(inter,(a, b) -> Integer.compare(a[0], b[0]));
       // int k = inter[0][1];
        ArrayList<ArrayList<Integer>> z = new ArrayList<>();
        //z.add(new ArrayList<>());
       // z.get(1).add(inter[0][0]);
        int p = inter[0][0];
        int k = inter[0][1];
        for(int i=1;i<inter.length;i++)
        {
            if(k >= inter[i][0])
            {
                k = Math.max(inter[i][1],k);
            }
            else
            {
                z.add(new ArrayList<>());
                z.get(z.size()-1).add(p);
                z.get(z.size()-1).add(k);
                p = inter[i][0];
                k = inter[i][1];
            }
        }
        z.add(new ArrayList<>());
                z.get(z.size()-1).add(p);
                z.get(z.size()-1).add(k);
        int n = z.size();
        int a[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0] = z.get(i).get(0);
            a[i][1] = z.get(i).get(1);
        }
        return a;

    }
}