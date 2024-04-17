public class Ass3_3 
{
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void reverseElement()
    {
        
        Node nextnNode = null;
        Node current = head;
        Node prev = null;

        while (current != null) 
        {
            nextnNode = current.next;
            current.next = prev;
            prev = current;
            current = nextnNode;
            
        }

        head = prev;
    }

    static void printElement() 
    {
        if (head == null) 
        {
            return;
        }
        Node n = head;
        while (n != null) 
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) 
    {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        reverseElement();
        printElement();
    }

}
