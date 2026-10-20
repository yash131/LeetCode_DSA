class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) 
    {
        long c = 0;
        long p =0;
        for (int x = 0 ; x<=total/cost1;x++)
        {
            long r = (long)total - (long)x * cost1;

            p = r/cost2;
          c +=p+1; 
           

        }
        return c;
        
    }
}