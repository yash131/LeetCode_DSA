class Solution {
    public String getHint(String secret, String guess) 
    {
        char [] a1 = secret.toCharArray();
         char [] a2 = guess.toCharArray();
         int c1=0,c2 =0;
         int k = 0;
         boolean [] f1 = new  boolean [a1.length];
          boolean [] f2 = new  boolean [a2.length];

         for (int x = 0 ; x<a1.length;x++)
         {
            if (a1[x]==a2[x])
            {
                c1++;
                f1[x]=true;
                f2[x]=true;
         
            }
            
         }
         for (int x = 0 ; x<a1.length;x++)
         {
            if (f1[x])
            {
                continue;
            }
            for (int y = 0 ; y<a1.length;y++)
            {
                if (f2[y]==false && a1[x]==a2[y])
                {
                    c2++;
                    f1[x]=true;
                    f2[y]= true;
                    break;
                }
            }
           

         }
         String s = c1+"A"+c2+"B";

        return s;        
    }
}