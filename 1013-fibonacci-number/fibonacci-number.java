class Solution {
    public int fib(int n) 
    {
        int a = 0;
        int b = 1;
        int c = 0;

        while (n>0)
        {
            a=b;
            b=c;
            c=a+b;
            n=n-1;
        }
        return c;
        
    }
}