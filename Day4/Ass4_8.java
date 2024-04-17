class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Ass4_8 {
    public boolean search(TreeNode root, int target) {
        if (root == null) {
            return false; 
        }

        if (root.val == target) {
            return true; 
        }

       
        return search(root.left, target) || search(root.right, target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Ass4_8 searcher = new Ass4_8();

        int target = 5;
        if (searcher.search(root, target)) {
            System.out.println( target + " found ");
        } else {
            System.out.println(target + " not found ");
        }
    }
}
