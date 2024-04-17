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

    public Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
    
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
    
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
    
        return dummy.next;
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

public class Ass3_6 {

    public static void main(String[] args) {
        ln l1 = new ln();
        ln l2 = new ln();
        l1.add(10);
        l2.add(20);
        l2.add(30);
        l1.add(40);
        l1.add(50);
        l1.display();
        l2.display();
        ln res = new ln();
        res.head = res.mergeSortedLists(l1.head, l2.head); 
        res.display();

    }

}
