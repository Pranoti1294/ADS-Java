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

public class Ass4_9 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode target) {
        if (root == null || target == null) {
            return null; 
        }

        if (target.right != null) {
            
            TreeNode current = target.right;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        } else {
            
            TreeNode successor = null;
            TreeNode ancestor = root;
            while (ancestor != null) {
                if (target.val < ancestor.val) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else if (target.val > ancestor.val) {
                    ancestor = ancestor.right;
                } else {
                    break; 
                }
            }
            return successor;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        Ass4_9 finder = new Ass4_9();

        TreeNode target = root.left.right; // Target node: 15
        TreeNode successor = finder.inorderSuccessor(root, target);

        if (successor != null) {
            System.out.println("Inorder successor of " + target.val + " is " + successor.val);
        } else {
            System.out.println("Inorder successor of " + target.val + " not found");
        }
    }
}
