package dev.prithvis.solutions;

public class P222 {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
}