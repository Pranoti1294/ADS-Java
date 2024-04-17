
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class ln {
    Node head;

    public ln() {
        this.head = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean hasCycle(Node head) {
        if (head == null) return false;
    
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) return true;
        }
    
        return false;
    }
     
    public void display() {
        if (head == null)
            System.out.println("Empty.......");

        Node current = head;
        while (current != null) {
            System.out.print(current.val + "-->"); 
            current = current.next;
        }
        System.out.println();
    }

}



public class Ass3_7 
{
    public static void main(String[] args) {
        ln l1 = new ln();
       
        l1.add(10);
        l1.add(40);
        l1.add(50);
        l1.display();
        
        
        boolean r = l1.hasCycle(l1.head);
        System.out.println(r);
        l1.display();

    }
}
