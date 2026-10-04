class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> r = new ArrayList<>();
        bt(r,"",0,0,n);
        return r;
    }
    public void bt ( List<String> r, String c , int o , int cl , int max)
    {
        if (c.length() >= max*2)
        {
            r.add(c);
            return  ;
        }
        if (o < max )
        {
            bt(r,c+'(',o+1,cl,max);
        }
        if (cl <  o)
        {
            bt(r,c + ')',o,cl+1,max);
        }
    }
}