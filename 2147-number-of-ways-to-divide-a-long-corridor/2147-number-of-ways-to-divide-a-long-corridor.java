class Solution {
    int MOD = (int)1e9 + 7;
    int dp[][] =new int[100001][3];
   // long long dp[100001][3];
    public int numberOfWays(String cor) 
    {
        for(int x[]: dp)
        Arrays.fill(x,-1);
        return f(cor,0,0);
    }
    public int f(String cor,int i,int k)
    {
        if(i>=cor.length())
        {
            if(k==2)
            return 1;
            else
            return 0;
        }
        if(dp[i][k]!=-1)
        return dp[i][k];
        if(k==2)
        {
            if(cor.charAt(i)=='P')
            {
                dp[i][k] =  (f(cor,i+1,0)%MOD+f(cor,i+1,k)%MOD)%MOD;
                return dp[i][k];
            }
            else
            return dp[i][k] = f(cor,i+1,1)%MOD;// not do 1+f() because we donot count sticks we count way and here is only one way possible.
        }
        else
        {
            if(cor.charAt(i) == 'S')
            return dp[i][k]=f(cor,i+1,k+1)%MOD;
            else
            return dp[i][k] =f(cor,i+1,k)%MOD;
        }
    }
}