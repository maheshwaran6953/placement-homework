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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans  = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode val = q.poll();
                list.add(val.val);
                if(val.left != null) q.offer(val.left);
                if(val.right != null) q.offer(val.right);
            }
            if(count % 2 == 0)
                ans.add(new ArrayList<>(list));
            else {
                Collections.reverse(list);
                ans.add(new ArrayList<>(list));
            }
            count++;
        }
        return ans;
    }
}