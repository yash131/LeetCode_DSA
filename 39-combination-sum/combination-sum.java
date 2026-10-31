import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       

         List<List<Integer>> a = new ArrayList<>();
        
            bfs (candidates,0,target,new ArrayList<>(), a);
       
        return a;
    }
     public void bfs (int[] candidates, int s,int target, List<Integer> c , List<List<Integer>> a)
    {
        if ( target==0)
        {
            a.add(new ArrayList<>(c));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int x = s;x<=candidates.length-1;x++)
        {
            c.add(candidates[x]);
            bfs (candidates,x,target-candidates[x],c,a);
            c.remove(c.size() -1);
        }

   
    }
}
