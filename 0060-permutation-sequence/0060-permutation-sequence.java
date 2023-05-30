class Solution {
    public String getPermutation(int n, int k) 
    {
       /* String s = "123456789";
        String ans = "";
        while(k>1)
        {
            int fac = fact(n--);
            int z = k/fac;
            System.out.println(z);
            ans += s.charAt(z);
            k = k % fac;
        }
        return ans;*/
        
        LinkedList<Integer> notUsed = new LinkedList<Integer>();

	    int weight = 1;

	   for (int i = 1; i <= n; i++)
       {
		notUsed.add(i);
		if (i == n)
			break;
		weight = weight * i;
	    }
        for(int x : notUsed)
        System.out.print(x);
        System.out.println();
        System.out.println(weight+" weights ");
	String res = "";
	k = k - 1;
	while (true) 
    {

        System.out.println(k/weight+" k/ wieghts");
		res = res + notUsed.remove(k / weight);
		k = k % weight;
		if (notUsed.isEmpty())
			break;
		weight = weight / notUsed.size();
	}

	return res;


    }

    public int fact(int n)
    {
        int res = 1;
        while(n>1)
        {
            res *= n;
            n--;
        }
        return res;
    }
}