class Solution {
    private int count;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = 0;
        traverse(root, k);
        return result;
    }
    private void traverse(TreeNode node, int k) {
        if (node == null)
            return;
        traverse(node.left, k);
        count++;
        
        if (count == k) {
            result = node.val;
            return;
        }
        traverse(node.right, k);
    }
}
