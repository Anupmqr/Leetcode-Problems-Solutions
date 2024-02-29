/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isEven = true;
        while(q.size() > 0){
            int n = q.size();
            int prev = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            while(n-- > 0){
                root = q.poll();
                if(isEven && (root.val%2==0 || root.val<=prev))
                    return false;
                if(!isEven && (root.val%2==1 || root.val>=prev))
                    return false;
                prev = root.val;
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!=null)
                    q.add(root.right);
            }
            isEven = !isEven;
        }
        return true;
    }
}
