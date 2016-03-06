/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if (root==null)
            return ret;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                list.add(t.val);
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            ret.add(list);
        }
        return ret;
    }
}
