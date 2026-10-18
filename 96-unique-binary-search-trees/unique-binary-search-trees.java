class Solution {
    int []dp;
    public int numTrees(int n) 
    {
        dp = new int [n+1];
        return result( n);
        
    }
    public int result(int n)
    {
        if (n<=1)
        {
            return 1;
        }
        if (dp [n] !=0)
        {
            return dp[n];
        }
        int count =0;
        for (int x = 1 ; x<=n; x++ )
        {
            int l = result (x-1);
            int r = result(n-x);
            count += l*r;

        }
        dp[n]=count;
        return count;
    }
}