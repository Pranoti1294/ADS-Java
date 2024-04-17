
public class BT {
    Node root;
    
    class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data; 
        }
    }

    BT() {
        this.root = null;
    }
   
    void printInOrder(Node root) {
        if(root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    void printPreOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        printPreOrder(root.left); 
        printPreOrder(root.right); 
    }

    void printPostOrder(Node root) {
        if(root == null)
            return;
        printPostOrder(root.left); 
        printPostOrder(root.right); 
        System.out.print(root.data + " ");
    }

    static int depth(Node n) {
        if (n == null) {
            return 0;
        } else {
            int leftDepth = depth(n.left);
            int rightDepth = depth(n.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
    

    void printdata() {
        System.out.print("In-order traversing : ");
        printInOrder(root);
        System.out.print("\nPre-order traversing : "); 
        printPreOrder(root);
        System.out.print("\nPost-order traversing : "); 
        printPostOrder(root);
    }

    public static void main(String[] args) {
        BT t1 = new BT();
        t1.root = t1.new Node(5); 
        t1.root.left = t1.new Node(3); 
        t1.root.right = t1.new Node(7); 
        t1.root.left.left = t1.new Node(2); 
        t1.root.right.right = t1.new Node(8); 
        System.out.println("Depth of BT : " + depth(t1.root));
        t1.printdata();
    }   
}
