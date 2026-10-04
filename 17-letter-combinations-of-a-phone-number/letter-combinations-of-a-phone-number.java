class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> s = new ArrayList<>();

        if (digits.length()==0)
        {
            return s;
        }

        String [] m = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        slove (s,m,"",0,digits);
        return s;
        
    }
     public void slove ( List<String> s , String [] m , String c,int i, String d)
     {
        if (i==d.length())
        {
            s.add(c);
            return;
        }
        String letter = m[d.charAt(i)-'0'];
        for (char ch : letter.toCharArray())
        {
            slove(s,m,c+ch,i+1,d);
        }

     }
}