class Solution {
    public int reverseBits(int n) 
    {
        String b = Integer.toBinaryString(n);
         while (b.length() < 32) 
         {
            b = "0" + b;
        }
        String reversed = new StringBuilder(b).reverse().toString();
        int decimal = Integer.parseInt(reversed, 2);
        return decimal;
        
    }
}