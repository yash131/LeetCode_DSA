class Solution {
    public String decodeAtIndex(String s, int k) 
    {
        long ss = 0;

        for (int x = 0 ;x<s.length();x++)
        {
            char ch = s.charAt(x);
            if (Character.isDigit(ch))
            {
                ss = ss*(ch -'0');

            }
            else
            {
                ss=ss+1;
            }
        }

        for (int x =s.length()-1;x>=0;x--)
        {
            char ch = s.charAt(x);
            k = (int) (k % ss);
            if (Character.isDigit(ch))
            {
                ss= ss/(ch-'0');
            }
            else
            {
                if (k==0)
                {
                    return String.valueOf(ch);
                }
                ss--;
            }
        }
        return "";
    }
}