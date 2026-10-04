class Solution {
    public int rob(int[] nums) 
    {
        int p1 = 0;
        int p2 = 0;

        for (int x = 0; x < nums.length; x++)
        {
            int c = Math.max(p2 + nums[x], p1);

            p2 = p1;
            p1 = c;
        }

        return p1;
    }
}