package week.two;

public class DiameterTree {
    int m = 0;
    public static void main(String[] args){
        int[] vals = new int[]{1,2,3,4,5};
        int[] vals2 = new int[]{1,2,3,4,5};
        TreeNode head = null;
        TreeNode head2 = null;
        for(int i: vals){
            head = new TreeNode(i, head, null);
        }
        for(int i: vals2){
            head2 = new TreeNode(i, head2, null);
        }
        TreeNode head3 = new TreeNode(1, head, head2);

        DiameterTree tree = new DiameterTree();
        System.out.println(tree.getDiameter(head3));
        System.out.println(tree.m);
    }
    public int getDiameter(TreeNode node){
        if(node == null)
            return 0;
        int left = node.left == null ? 0 : 1 + getDiameter(node.left);
        int right = node.right == null ? 0 : 1 + getDiameter(node.right);
        if(left + right > m){
            m = left + right;
        }
        return Math.max(left, right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}