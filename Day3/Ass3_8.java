class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return -1; 
        }

        Node slow = head;
        Node fast = head;

        
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1;
            }
            fast = fast.next;
        }

        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data; 
    }
}

public class Ass3_8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        int n = 2; 

        int nthFromEnd = list.findNthFromEnd(n);

        if (nthFromEnd != -1) {
            System.out.println("The " + n + "th element from the end is: " + nthFromEnd);
        } else {
            System.out.println("Invalid input or element not found.");
        }
    }
}