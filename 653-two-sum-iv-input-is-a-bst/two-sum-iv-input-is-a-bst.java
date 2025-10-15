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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        inorder(root,l);
        int left=0;
        int right=l.size()-1;
        while(left<right){
            int sum=l.get(left)+l.get(right);
            if(sum==k){
                return true;
            }else if(k>sum){
                left++;
            }else{
                right--;
            }
            
        }
        return false;
    }

        
    
    private void inorder(TreeNode root,List<Integer> l){
        if(root==null){return ;}
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
}