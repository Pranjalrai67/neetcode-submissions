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

    public int[] solve(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        int[] leftPair = solve(root.left);
        int[] rightPair = solve(root.right);
        int without = Math.max(leftPair[0],leftPair[1]) + Math.max(rightPair[0],rightPair[1]);
        int with =root.val +  leftPair[1] + rightPair[1];
        int[] ans = {with,without} ;
        return ans;
    }
 
    public int rob(TreeNode root) {

        int[] ans = solve(root);
        return Math.max(ans[0],ans[1]);
    }
}