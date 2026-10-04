class Solution 
{
    public boolean isValid(String s) 
    {
       char [] c = s.toCharArray();
       Stack <Character> ss = new Stack <>();

       for (int x = 0 ; x<s.length();x++)
       {
         char ch = s.charAt(x);
         if (ch == '(' || ch=='[' || ch=='{')
         {
            ss.push(ch);
         }
         else
         {
            if (ss.isEmpty())
            {
                return false;
            }
            char top = ss.pop();

            if (ch==')' && top != '(')
            {
                return false;
            }
             if (ch==']' && top != '[')
            {
                return false;
            }
             if (ch=='}' && top != '{')
            {
                return false;
            }
         }
        
       }
        return ss.isEmpty();
    }
}