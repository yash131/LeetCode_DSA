class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int j = 0;

        for (int x= m ; x<m+n;x++)
        {
            nums1[x]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }}
           