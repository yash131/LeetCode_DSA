class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        int k=-1;
        for (int x= 0;x<nums.length-1;x++)
        {
           
                if (nums[x]==nums[x+1])
                {
                    k=1;
                    break;
                }
            
        }
        if (k==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}