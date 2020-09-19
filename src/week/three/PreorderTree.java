package week.three;


public class PreorderTree {
    public static void main(String[] args){
        int[] testcase = new int[]{8,5,1,7,10,12};
        System.out.println("The root value is: " + contructTree(testcase).val);
    }

    static TreeNode contructTree(int[] preorder){
        if(preorder == null || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++){
            addToTree(root, preorder[i]);
        }
        return root;
    }

    static void addToTree(TreeNode root, int val){
        System.out.println(val);
        if(val<root.val && root.left == null){
            root.left = new TreeNode(val);
            return;
        }
        if(val > root.val && root.right == null){
            root.right = new TreeNode(val);
            return;
        }
        if(val < root.val){
            addToTree(root.left, val);
            return;
        }else{
            addToTree(root.right, val);
            return;
        }
    }
}

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
    }
}