class Solution {
    public String reverseVowels(String s) 
    {
        char [] a = s.toCharArray();
        int ll = s.length();
        int l = 0;
        int r = ll-1;
        while(l<r)
        {
            while (l<r && !isVowel(a[l]))
            {
                l++;
            }
              while (l<r && !isVowel(a[r]))
            {
                r--;
            }
            char t = a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
        return new String(a);
       
    }
    private boolean isVowel(char c)
    {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}