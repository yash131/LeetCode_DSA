class Solution {
    public int singleNumber(int[] nums) 
    {
        int c=0;
        int k =0;
        for (int x = 0 ; x<nums.length;x++)
        {
            c=0;
        for(int y = 0 ; y <nums.length ;y++)
        {
            if (nums[x]==nums[y])
            {
                c++;
            }
        }
        if (c==1)
        {
            k=nums[x];
            break;
        }
        }
        return k;
        
    }
}