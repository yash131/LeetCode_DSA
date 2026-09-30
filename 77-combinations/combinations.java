class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> a = new ArrayList<>();
        
            bfs (1,n,k,new ArrayList<>(), a);
       
        return a;
    }
    public void bfs (int s , int n,int k, List<Integer> c , List<List<Integer>> a)
    {
        if (c.size() ==k)
        {
            a.add(new ArrayList<>(c));
            return;
        }
        for (int x = s;x<=n;x++)
        {
            c.add(x);
            bfs (x+1,n,k,c,a);
            c.remove(c.size() -1);
        }
        
    }
}