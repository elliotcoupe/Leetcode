package week.five;


public class BinaryTreeMaxPathSum {
    public static void main(String[] args){
        TreeNode testcase = new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode( 15), new TreeNode(7)));
        System.out.println("Resuslt : " + maxPathSum(testcase));
    }
    static int res = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root){
        dfs(root);
        return res;
    }
    public static int dfs(TreeNode root){
        if(root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int cur = root.val, up = root.val;
        int p = Math.max(left, right);
        if(p>0){
            up+=p;
        }
        if(left > 0){
            cur+= left;
        }
        if(right > 0){
            cur +=  right;
        }
        res = Math.max(res, cur);
        return up;
    }


}
class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}