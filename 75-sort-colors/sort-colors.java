class Solution {
    public void sortColors(int[] nums)
     {
        for (int x=0; x< nums.length-1 ; x++)
        {
            for (int y =0 ; y<nums.length-x-1 ; y++)
            {
                if (nums[y] > nums[y+1])
                {
                    int k = nums[y];
                    nums[y]=nums[y+1];
                    nums[y+1]=k;
                }
            }
        }
    }
}