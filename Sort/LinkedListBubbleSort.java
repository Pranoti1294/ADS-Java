class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedListBubbleSort {
    static Node head;

    public LinkedListBubbleSort() {
        head = null;
    }

    static void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = n;
    }

    static void bubbleSort()
    {

        if(head == null || head.next ==null)
        {
            return;
        }

        Node temp ;
        boolean swap;
        do
        {
            swap = false;
            Node current = head;

            while(current.next !=null)
            {
                if(current.data > current.next.data)
                {

                    temp = new Node (current.data);
                    current.data = current.next.data;
                    current.next.data = temp.data;

                    swap =true;
                }

                current = current.next;
            }

        }while(swap);

    }
    static void display() {
        Node c = head;
        while (c != null) {
            System.out.print(c.data + " -->"); 
            c = c.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        insert(10);
        insert(20);
        insert(90);
        insert(40);
        insert(20);
        bubbleSort();
        display();
    }
}
