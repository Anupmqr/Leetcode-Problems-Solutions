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

    public void dfs(TreeNode root, int[] freq, int[] count){
        if(root == null)
            return;
        
        freq[root.val]++;
        dfs(root.left,freq, count);
        if(root.left == null && root.right == null){
            int c = 0;
            for(int n : freq){
                if(n%2 == 1)
                    c++;
            }
            if(c <= 1)
                count[0]++;
        }
        dfs(root.right, freq,count);
        freq[root.val]--;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] count = {0};
        int[] freq = new int[10];
        dfs(root,freq,count);
        return count[0];
    }
}
