/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) 
    {
        if (n == 0 )
        {
            return new ArrayList<>();
        }
        return build(1,n);
        
    }
    public List<TreeNode> build(int start , int end)
    {
        List<TreeNode> r = new ArrayList<>();
        if (start>end)
        {
            r.add(null);
            return r;

        }
        for (int x = start ; x<=end ; x++)
        {
            List<TreeNode> l = build(start , x-1);
            List<TreeNode> ri = build (x+1 , end);


            for (TreeNode left : l)
            {
                for (TreeNode right : ri)
                {
                    TreeNode root = new TreeNode (x);
                    root.left = left;
                    root.right = right;
                    r.add(root);
                }
            }

        }
        return r;

    }
}