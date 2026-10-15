class Solution {
    public String intToRoman(int num)
    {
        int [] n = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []s = {"M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};
        StringBuilder a = new StringBuilder();

        for (int x = 0 ; x<n.length ; x++)
        {
            while (num >= n[x])
            {
                num = num - n[x];
                a.append(s[x]);
            }
        }
        return a.toString();


        
    }
}